package Nutt.Types.Functional.Type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
public class TypeHeader
{
	private java.lang.String displayName;
	@Setter
	private Type parent;
	@Builder.Default
	private List<Type> children=new ArrayList<>();
	private List<Type> typeParameters;
}
