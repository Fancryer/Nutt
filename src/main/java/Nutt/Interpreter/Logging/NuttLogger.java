package Nutt.Interpreter.Logging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class NuttLogger
{
	private final static String extension=".json";
	private final static DateTimeFormatter timeStampPattern=DateTimeFormatter.ofPattern("HHmmssSSSZZZZZ");
	private final List<LogStamp> logStamps=new ArrayList<>();

	public void appendLog(String action,String message)
	{
		appendLog(action,message,ESeverity.Info);
	}

	public void appendLog(String action,String message,ESeverity severity)
	{
		appendLog(action,message,EActionStatus.Success,severity);
	}

	public void appendLog(String action,String message,EActionStatus status,ESeverity severity)
	{
		appendLog(LogStamp.builder().action(action).message(message).status(status).severity(severity).build());
	}

	public void appendLog(LogStamp log)
	{
		logStamps.add(log);
	}

	public String writeLogs()
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
		var logFile=new File(Path.of(logFilePath).toUri());
		if(!logFile.getParentFile().mkdirs()) return logFilePath;
		try(var writer=new FileWriter(logFile,true))
		{
			writer.write(logStamps.stream().map(LogStamp::serialize).toList().toString());
			return logFilePath;
		}
		catch(IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	public List<LogStamp> getLogStamps()
	{
		return logStamps;
	}
}