package Nutt.Types.Functional.Record;

import Nutt.NuttEnvironment;
import Nutt.Pair;
import Nutt.ParseHelpers.Row;
import Nutt.TypeInferencer;
import Nutt.Types.Functional.Actionable.Procedure.LambdaBuilder;
import Nutt.Types.Functional.Actionable.Procedure.Procedure;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.IFunctional;
import Nutt.Types.Functional.Listable.Array.Array;
import Nutt.Types.Functional.Type.Type;
import Nutt.Types.IValuable;
import com.google.common.collect.Streams;
import lombok.Getter;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gen.Nutt.Vararg_or_signatureContext;

public class Record implements IFunctional
{
	@Getter private List<Row> rows;
	private String name;

	public Record(List<Row> rows)
	{
		this("Record",rows);
	}

	public Record(String name,List<Row> rows)
	{
		this.name=name;
		this.rows=rows;
	}

	private static List<Pair<Row,Row>> zipMembers(Record r1,Record r2)
	{
		return zipMembersStream(r1,r2).toList();
	}

	private static Stream<Pair<Row,Row>> zipMembersStream(Record r1,Record r2)
	{
		return Streams.zip(r1.rows.stream(),r2.rows.stream(),Pair::new);
	}

	Map<String,Procedure> getDefaultOperators()
	{
		Signature defaultSignature=getDefaultSignature();
		Function<String,Procedure> buildLambda=s->new LambdaBuilder()
				.setSignature(defaultSignature)
				//.setOutput(this.replicate())
				.setFunctionBody(convertToInfixed(s,rows))
				.createProcedure();
		return Stream.of("+","-","*","/","//","%","^")
		             .map(s->Map.entry(s,buildLambda.apply(s)))
		             .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
	}

	private static Signature getDefaultSignature()
	{
		Function<String,Vararg_or_signatureContext> paramContextFunction=s->NuttEnvironment.getTempParser(s).vararg_or_signature();
		return new Signature(List.of(paramContextFunction.apply("r1"),paramContextFunction.apply("r2")));
	}

	private static String convertToInfixed(String op,List<Row> rows)
	{
		return convertToInfixed("r1","r2",op,rows);
	}

	private static String convertToInfixed(String a,String b,String op,List<Row> rows)
	{
		return asSortedRows(rows)
				.stream()
				.map(row->"%s:%s.%s%s%s.%s".formatted(row.name(),a,row.name(),op,b,row.name()))
				.collect(Collectors.joining(",","{","}"));
	}

	private static List<Row> asSortedRows(List<Row> rows)
	{
		return rows.stream().sorted(Comparator.comparing(Row::name)).toList();
	}

	public Record setName(String name)
	{
		this.name=name;
		return this;
	}

	@Override
	public Type getType()
	{
		return TypeInferencer.findTypeReference(name).getType();
	}

	@Override public String toSerializedString()
	{
		return toString();
	}

	@Override
	public Object getValue()
	{
		return null;
	}

	@Override public String toString()
	{
		return "{%s}".formatted(rows.stream().map(Row::toString).collect(Collectors.joining(",")));
	}

	@Override public Record replicate()
	{
		return new Record(this.name,this.rows);
	}

	//TODO
	@Override public Array spread()
	{
		return null;
	}

	public IValuable getMember(String name)
	{
		for(var row: rows) if(row.name().equals(name)) return row.value();
		throw new RuntimeException();
	}

	public Record setRows(List<Row> rows)
	{
		this.rows=rows;
		return this;
	}
}