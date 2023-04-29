package Nutt;

import java.util.Objects;

public record Pair<L,R>(L left,R right)
{
	public Pair<R,L> reverse()
	{
		return new Pair<>(right,left);
	}

	@Override
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Pair<?,?> pair)) return false;
		if(obj==this) return true;
		return Objects.equals(this.left,pair.left)&&Objects.equals(this.right,pair.right);
	}

	@Override
	public String toString()
	{
		return "Pair[left=%s, right=%s]".formatted(left,right);
	}

}