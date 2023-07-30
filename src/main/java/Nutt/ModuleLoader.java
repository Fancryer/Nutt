package Nutt;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.Runtime.NativeLoader;
import Nutt.Visitors.NuttStatementVisitor;
import gen.Nutt.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleLoader
{
	public void importModule(String moduleName,NuttStatementVisitor statementVisitor)
	{
		if(NuttInterpreter.moduleNames.contains(moduleName)) return;
		if(moduleName.indexOf("native")==0)
		{
			var procedure=NativeLoader.loadNativeProcedure(moduleName.replaceAll("\\\\\\\\","."));
			NuttInterpreter.currentScope.addProcedure(procedure.getName(),procedure);
			return;
		}
		NuttInterpreter.moduleNames.add(moduleName);
		var chunk=NuttEnvironment.getTempParser(NuttCommon.readFileString("modules\\%s.nutt".formatted(moduleName))).chunk();
		var module=chunk.module();
		if(module==null) return;
		importModuleList(module.module_import(),statementVisitor);
		var block=module.block();
		if(block==null) return;
		block.stat()
		     .stream()
		     .filter(
				     st->st instanceof Functiondef_statContext
				         ||st instanceof Var_decl_statContext
				         ||st instanceof Operator_decl_statContext
				         ||st instanceof Annotation_decl_statContext
				         ||st instanceof Type_def_statContext
				         ||st instanceof Record_def_statContext
		            )
		     .forEach(statementVisitor::visit);
	}

	public List<String> parseModuleNameOrGroup(Module_name_or_groupContext ctx)
	{
		if(ctx.module_name()!=null) return List.of(getFullModuleName(ctx.module_name()));
		var groupPrefix=getFullModuleName(ctx.module_group().module_name())+".";
		var nameList=new ArrayList<String>();
		for(var moduleName: ctx.module_group().module_list().module_name_or_group())
		{
			if(moduleName.module_name()!=null) nameList.add(groupPrefix+getFullModuleName(moduleName.module_name()));
			else nameList.addAll(parseModuleNameOrGroup(moduleName).stream().map(i->groupPrefix+i).toList());
		}
		return nameList;
	}

	public void importModuleList(List<Module_importContext> importContexts,NuttStatementVisitor statementVisitor)
	{
		for(var i: importContexts) importModuleContext(i,statementVisitor);
	}

	public void importModuleContext(Module_importContext importContext,NuttStatementVisitor statementVisitor)
	{
		if(importContext.module_list()==null) return;
		importContext.module_list()
		             .module_name_or_group()
		             .forEach(m->importModuleGroup(m,statementVisitor));
	}

	private void importModuleGroup(Module_name_or_groupContext ctx,NuttStatementVisitor statementVisitor)
	{
		parseModuleNameOrGroup(ctx).forEach(module->importModule(module,statementVisitor));
	}

	public String getFullModuleName(Module_nameContext ctx)
	{
		return ctx.NAME()
		          .stream()
		          .map(TerminalNode::getText)
		          .collect(Collectors.joining("\\\\"));
	}
}
