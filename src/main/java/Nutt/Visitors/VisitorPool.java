package Nutt.Visitors;

public class VisitorPool
{
	public final static NuttArrayVisitor arrayVisitor=new NuttArrayVisitor();
	public final static NuttAssignmentVisitor assignmentVisitor=new NuttAssignmentVisitor();
	public final static NuttCompareVisitor compareVisitor=new NuttCompareVisitor();
	public final static NuttConditionVisitor conditionVisitor=new NuttConditionVisitor();
	public final static NuttDeclarationVisitor declarationVisitor=new NuttDeclarationVisitor();
	public final static NuttEvalVisitor evalVisitor=new NuttEvalVisitor();
	public final static NuttFunctionVisitor functionVisitor=new NuttFunctionVisitor();
	public final static NuttParametersVisitor parametersVisitor=new NuttParametersVisitor();
	public final static NuttRecordVisitor recordVisitor=new NuttRecordVisitor();
	public final static NuttStatementVisitor statementVisitor=new NuttStatementVisitor();
	public final static NuttStringVisitor stringVisitor=new NuttStringVisitor();
	public final static NuttTypeInferenceVisitor typeInferenceVisitor=new NuttTypeInferenceVisitor();
}
