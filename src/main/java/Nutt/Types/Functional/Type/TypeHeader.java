package Nutt.Types.Functional.Type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
public class TypeHeader
{
	private java.lang.String displayName;
	@Setter
	private Type parent;
	private List<Type> children;
	private List<Type> typeParameters;
}
