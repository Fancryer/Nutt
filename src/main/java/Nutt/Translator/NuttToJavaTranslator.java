package Nutt.Translator;

import lombok.ToString;
import picocli.CommandLine;

public class NuttToJavaTranslator
{
	public static void main(String[] args)
	{
		var translatorOptions=new TranslatorOptions();
		new CommandLine(translatorOptions).parseArgs(args);
		System.out.println("translatorOptions = "+translatorOptions);
	}
}

@ToString
class TranslatorOptions
{
	@CommandLine.Option(names={"-I"}, interactive=true, description="The input file", required=true)
	public String inputPath;
	@CommandLine.Option(names={"-o"}, interactive=true, description="The output file", required=true)
	public String outputPath;
}

