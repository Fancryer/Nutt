package gen;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class MultiChannelBaseParser extends Parser
{

	public MultiChannelBaseParser(TokenStream input)
	{
		super(input);
	}

	public void enable(int channel)
	{
		if(_input instanceof MultiChannelTokenStream input) input.enable(channel);
	}

	public void disable(int channel)
	{
		if(_input instanceof MultiChannelTokenStream input) input.disable(channel);
	}

}
