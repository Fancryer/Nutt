package Nutt.Repl;

import Nutt.Exceptions.NuttExitException;
import Nutt.NuttEnvironment;
import Nutt.NuttInterpreter;
import Nutt.Types.IValuable;
import Nutt.Visitors.NuttStatementVisitor;
import gen.Nutt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repl
{
	private final NuttEnvironment environment;
	private NuttInterpreter interpreter;

	public Repl()
	{
		this(new NuttEnvironment());
	}

	public Repl(NuttEnvironment environment)
	{
		this.environment=environment;
	}

	private static void printReplHeader()
	{
		var header=
				"""
				                                      ,. \s
				                                    ,... \s
				                         ,.............  \s
				                      ,........      ..   \s
				                   ,....            ..,  \s
				                  ,. ..         ,.   ...,\s
				        ,.........., ,.,  .    ,.      ..,
				     ,....        ......  .  ,..       ...
				   ,..,               ,......,          ..
				 ,... ......,   ,........ .......,   ,....
				,....  ............... ..  ...      ,....\s
				.. ..  ..    ..    ..  .., ..        ,.. \s
				.. ..  ..    ..    ..   .. ..    ,....   \s
				.. ..  ..    ..    ..  ,.  .. ,.....     \s
				.., ., ..,   ..    .. ,.. ,......        \s
				 ....., ..   ..   ,. ,.. ..              \s
				   .... ..,  ..  ,.. ....                \s
				     ... ... .. ... ...                  \s
				        ............                     \s
				            .....                        \s


				        Please enter your statements below""";
		System.out.println(header);
	}

	public void loop()
	{
		printReplHeader();
		try(Scanner input=new Scanner(System.in))
		{
			var lineList=new ArrayList<String>();
			interpreter=new NuttInterpreter();
			System.out.print("> ");
			while(true)
			{
				var scannedLine=input.nextLine();
				lineList.add(scannedLine.isBlank()?"\n":scannedLine);
				var lastIndex=lineList.size()-1;
				if(!lineList.get(lastIndex).equals("\n")) continue;
				lineList.remove(lastIndex);
				try
				{
					print(eval(read(lineList)));
				}
				catch(NuttExitException e)
				{
					break;
				}
				lineList=new ArrayList<>();
				System.out.print("> ");
			}
		}
		catch(RuntimeException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void print(List<IValuable> input)
	{
		input.forEach(System.out::println);
	}

	private List<IValuable> eval(List<Nutt.StatContext> input)
	{
		var visitor=new NuttStatementVisitor();
		return input.stream().map(visitor::visit).toList();
	}

	private List<Nutt.StatContext> read(List<String> input)
	{
		return NuttEnvironment.getTempParser(String.join("",input)).block().stat();
	}
}