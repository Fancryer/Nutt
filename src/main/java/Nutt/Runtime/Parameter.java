package Nutt.Runtime;

import lombok.NonNull;

public record Parameter(@NonNull String name,@NonNull String type,@NonNull String exp,boolean isVararg)
{
	public Parameter(String name,String type,String exp)
	{
		this(name,type,exp,false);
	}

	@Override
	public String toString()
	{
		return (isVararg?"...":"")+name+(type.equals("")?"":":"+type)+(exp.equals("")?"":"="+exp);
	}

	public String toFunctParameter()
	{
		return (isVararg?"%s:Array=%s":"%s:%s=%s").formatted(name,type,exp);
	}
}
