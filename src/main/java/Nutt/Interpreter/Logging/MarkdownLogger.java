package Nutt.Interpreter.Logging;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MarkdownLogger
{
	private final static String extension=".md";
	private final static DateTimeFormatter timeStampPattern=DateTimeFormatter.ofPattern("HHmmssSSSZZZZZ");
	private final String originalLogPath;

	public MarkdownLogger(String originalLogPath)
	{
		this.originalLogPath=originalLogPath;
	}

	private static List<String> splitCellText(String text,int maxLength)
	{
		var lines=new ArrayList<String>();
		if(text.length()<=maxLength) lines.add(text);
		else
		{
			int index=0;
			while(index<text.length())
			{
				int endIndex=Math.min(index+maxLength,text.length());
				lines.add(text.substring(index,endIndex));
				index=endIndex;
			}
		}
		return lines;
	}

	public void writeLog()
	{
		writeLog(parseLogListFromFile(originalLogPath));
	}

	public void writeLog(List<LogStamp> stamps)
	{
		var columnWidths=getColumnWidths(stamps);
		StringBuilder table=new StringBuilder()
				.append
						(
								String.format
										      (
												      "| %s | %s | %s | %s | %s | %s |\n",
												      rightPad("Timestamp",columnWidths[0]),
												      rightPad("Action",columnWidths[1]),
												      rightPad("Message",columnWidths[2]),
												      rightPad("Status",columnWidths[3]),
												      rightPad("Severity",columnWidths[4]),
												      rightPad("Depth",columnWidths[5])
										      )
						)
				.append("|:")
				.append("-".repeat(columnWidths[0]+1))
				.append("|:")
				.append("-".repeat(columnWidths[1]+1))
				.append("|:")
				.append("-".repeat(columnWidths[2]+1))
				.append("|:")
				.append("-".repeat(columnWidths[3]+1))
				.append("|:")
				.append("-".repeat(columnWidths[4]+1))
				.append("|:")
				.append("-".repeat(columnWidths[5]+1))
				.append("|\n");

		// Каждая строка данных
		for(LogStamp(String timeStamp,String action,String message,EActionStatus status,ESeverity severity,int depth): stamps)
				{
					table.append
							     (
									     String.format
											           (
													           "| %s | %s | %s | %s | %s | %s |\n",
													           rightPad(timeStamp,columnWidths[0]),
													           rightPad(action,columnWidths[1]),
													           rightPad(message,columnWidths[2]),
													           rightPad(status.name(),columnWidths[3]),
													           rightPad(severity.name(),columnWidths[4]),
													           rightPad(String.valueOf(depth),columnWidths[5])
											           )
							     );
				}
		try
		{
			var logFilePath="logs/%s/%s/%s/%s%s".formatted
					                                    (
							                                    OffsetDateTime.now().getYear(),
							                                    OffsetDateTime.now()
							                                                  .getMonth(),
							                                    OffsetDateTime.now().getDayOfMonth(),
							                                    OffsetDateTime.now()
							                                                  .format(timeStampPattern)
							                                                  .replace(":",""),
							                                    extension
					                                    );
			Path logFile=Paths.get(logFilePath);
			if(!Files.exists(logFile))
			{
				Files.createDirectories(logFile.getParent());
				Files.createFile(logFile);
			}

			try(FileWriter writer=new FileWriter(logFile.toFile(),true))
			{
				writer.write(table.toString());
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("Failed to write log entry: "+table,e);
		}
	}

	public static String rightPad(String input,int length)
	{

		return rightPad(input,length," ");
	}

	public static String rightPad(String input,int length,String padStr)
	{

		return input==null||padStr==null
		       ?null
		       :input.length()>=length
		        ?input
		        :input+padStr.repeat(length-input.length());
	}

	private Integer[] getColumnWidths(List<LogStamp> stamps)
	{
		int timeStampWidth=0, actionWidth=0, messageWidth=0, statusWidth=0, severityWidth=0, depthWidth=0;
		for(LogStamp(String stamp,String action,String message,EActionStatus status,ESeverity severity,int depth): stamps)
				{
					timeStampWidth=Math.max(timeStampWidth,stamp.length());
					actionWidth=Math.max
							                (
									                actionWidth,
									                action.replace("|","\\|")
									                      .replace("\\","\\\\")
									                      .length()
							                );
					messageWidth=Math.max
							                 (
									                 messageWidth,
									                 message.replace("|","\\|")
									                        .replace("\\","\\\\")
									                        .length()
							                 );
					statusWidth=Math.max(statusWidth,status.name().length());
					severityWidth=Math.max(severityWidth,severity.name().length());
					depthWidth=Math.max(depthWidth,String.valueOf(depth).length());
				}
		//		return new Integer[]
		//				{
		//						NuttCommon.minmax(timeStampWidth,9,30),
		//						NuttCommon.minmax(actionWidth,6,30),
		//						NuttCommon.minmax(messageWidth,7,30)
		//				};
		return new Integer[]
				{
						Math.max(9,timeStampWidth),
						Math.max(6,actionWidth),
						Math.max(7,messageWidth),
						Math.max(6,statusWidth),
						Math.max(8,severityWidth),
						Math.max(5,String.valueOf(depthWidth).length())
				};
	}

	public static List<LogStamp> parseLogListFromFile(String filePath)
	{
		List<LogStamp> logStamps=new ArrayList<>();
		try
		{
			String jsonString=Files.readString(Path.of(filePath));
			int index=0;
			while(index<jsonString.length())
			{
				char ch=jsonString.charAt(index);
				if(ch=='{')
				{
					int closingBracketIndex=findClosingBracketIndex(jsonString,index);
					var logStampString=jsonString.substring(index,closingBracketIndex+1);
					var logStamp=parseLogStamp(logStampString);
					logStamps.add(logStamp);
					index=closingBracketIndex+1;
				}
				else index++;
			}

			return logStamps;
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private static LogStamp parseLogStamp(String logStampString)
	{
		String[] parts=logStampString.split(",");
		String timeStamp=processJSONField(parts[0]),
				action=processJSONField(parts[1]),
				message=processJSONField(parts[2]),
				status=processJSONField(parts[3]),
				severity=processJSONField(parts[4]),
				depth=processJSONField(parts[5]);
		return LogStamp.builder()
		               .timeStamp(timeStamp)
		               .action(action.replace("|","\\|"))
		               .message(message.substring(0,message.length()-1).replace("|","\\|"))
		               .status(EActionStatus.valueOf(status))
		               .severity(ESeverity.valueOf(severity))
		               .depth(Integer.parseInt(depth))
		               .build();
	}

	private static String processJSONField(String field)
	{
		return field.split(":")[1].trim().replace("\"","");
	}

	private static int findClosingBracketIndex(String jsonString,int openingBracketIndex)
	{
		int count=1, index=openingBracketIndex+1;
		while(count>0)
		{
			count+=switch(jsonString.charAt(index))
			{
				case '{' -> 1;
				case '}' -> -1;
				default -> 0;
			};
			index++;
		}
		return index-1;
	}
}