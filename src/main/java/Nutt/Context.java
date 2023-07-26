package Nutt;

import java.util.HashMap;
import java.util.Map;

public class Context
{
	private final Map<String,String> macroParametersMap;

	public Context(Map<String,String> macroParametersMap)
	{
		this.macroParametersMap=macroParametersMap;
	}

	public Context()
	{
		this.macroParametersMap=new HashMap<>();
	}
}