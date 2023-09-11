package Nutt.Types.Functional.Type.Native;

import Nutt.Types.Functional.Actionable.Procedure.Operator;
import Nutt.Types.Functional.Actionable.Procedure.Signature;
import Nutt.Types.Functional.Numerable.Boolean;
import Nutt.Types.Functional.Numerable.Int.Int;
import lombok.Getter;

public class IntType extends NativeType
{
	@Getter
	private final static IntType instance=new IntType();

	private IntType()
	{
		super(NumerableType.getInstance(),"Int");
		var intSignature=new Signature("a:Int,b:Int","Int");
		var boolSignature=new Signature("a:Int,b:Int","Boolean");
		addOperators
				(
						new Operator
								(
										"+",
										intSignature,
										(left,right)->new Int
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .add(right.getValueAs(Int.class).asBigInteger())
												)
												.toAnonymousReference()
								)
								.toAnonymousReference(),
						new Operator
								(
										"-",
										intSignature,
										(left,right)->new Int
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .subtract(right.getValueAs(Int.class).asBigInteger())
												)
												.toAnonymousReference()
								)
								.toAnonymousReference(),
						new Operator
								(
										"*",
										intSignature,
										(left,right)->new Int
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .multiply(right.getValueAs(Int.class).asBigInteger())
												)
												.toAnonymousReference()
								)
								.toAnonymousReference(),
						new Operator
								(
										"/",
										intSignature,
										(left,right)->new Int
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .divide(right.getValueAs(Int.class).asBigInteger())
												)
												.toAnonymousReference()
								)
								.toAnonymousReference(),
						new Operator
								(
										"<=",
										boolSignature,
										(left,right)->new Boolean
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .compareTo(right.getValueAs(Int.class).asBigInteger())<=0
												)
												.toAnonymousReference()

								)
								.toAnonymousReference(),
						new Operator
								(
										"<",
										boolSignature,
										(left,right)->new Boolean
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .compareTo(right.getValueAs(Int.class).asBigInteger())<0
												)
												.toAnonymousReference()

								)
								.toAnonymousReference(),
						new Operator
								(
										"===",
										boolSignature,
										(left,right)->new Boolean
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .compareTo(right.getValueAs(Int.class).asBigInteger())==0
												)
												.toAnonymousReference()

								)
								.toAnonymousReference(),
						new Operator
								(
										">",
										boolSignature,
										(left,right)->new Boolean
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .compareTo(right.getValueAs(Int.class).asBigInteger())>0
												)
												.toAnonymousReference()
								)
								.toAnonymousReference(),
						new Operator
								(
										">=",
										boolSignature,
										(left,right)->new Boolean
												(
														left.getValueAs(Int.class)
														    .asBigInteger()
														    .compareTo(right.getValueAs(Int.class).asBigInteger())>=0
												)
												.toAnonymousReference()
								)
								.toAnonymousReference()
				);
	}
}
