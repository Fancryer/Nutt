package Nutt.Repl;

import Nutt.Exceptions.NuttExitException;
import Nutt.Interpreter.References.NuttReference;
import Nutt.NuttEnvironment;
import Nutt.Visitors.VisitorPool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static gen.NuttParser.StatContext;

public class Repl
{

	public Repl()
	{
		new NuttEnvironment();
	}

	public void loop()
	{
		printReplHeader();
		try(Scanner input=new Scanner(System.in))
		{
			var lineList=new ArrayList<String>();
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

	private void print(List<NuttReference> input)
	{
		input.stream().map(NuttReference::getValue).forEach(System.out::println);
	}

	private List<NuttReference> eval(List<StatContext> input)
	{
		var visitor=VisitorPool.statementVisitor;
		return input.stream().map(visitor::visit).toList();
	}

	private List<StatContext> read(List<String> input)
	{
		return NuttEnvironment.getTempParser(String.join("",input)).block().stat();
	}
}