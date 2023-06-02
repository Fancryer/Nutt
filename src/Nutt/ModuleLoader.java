package Nutt;

import gen.Nutt;
import Nutt.Visitors.NuttStatementVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleLoader
{
	public void importModule(String moduleName,NuttStatementVisitor statementVisitor)
	{
		if(NuttInterpreter.moduleNames.contains(moduleName)) return;
		NuttInterpreter.moduleNames.add(moduleName);
		var chunk=NuttEnvironment.getTempParser(NuttCommon.readFile("modules\\%s.nutt".formatted(moduleName))).chunk();
		var module=chunk.module();
		if(module==null) return;
		importModuleList(module.module_import(),statementVisitor);
		var block=module.block();
		if(block==null) return;
		block.stat()
		     .stream()
		     .filter(st->(st instanceof Nutt.Functiondef_statContext)
		                 ||(st instanceof Nutt.Var_decl_statContext))
		     .forEach(statementVisitor::visit);
		//		statStream.map(Nutt.StatContext::functiondef_stat)
		//		          .filter(Objects::nonNull)
		//		          .forEach(statementVisitor::visitFunctiondef_stat);
		//		statStream.map(Nutt.StatContext::var_decl).filter(Objects::nonNull).forEach
		//		(statementVisitor::visitVar_decl);
		//statementVisitor.visit(chunk);
	}


	public List<String> parseModuleNameOrGroup(Nutt.Module_name_or_groupContext ctx)
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

	public void importModuleList(List<Nutt.Module_importContext> importContexts,
	                             NuttStatementVisitor statementVisitor)
	{
		for(var i: importContexts) importModuleContext(i,statementVisitor);
	}

	public void importModuleContext(Nutt.Module_importContext importContext,
	                                NuttStatementVisitor statementVisitor)
	{
		if(importContext.module_list()==null) return;
		new ArrayList<>(importContext.module_list().module_name_or_group()).forEach(
				m->importModuleGroup(m,statementVisitor));
	}

	private void importModuleGroup(Nutt.Module_name_or_groupContext ctx,NuttStatementVisitor statementVisitor)
	{
		var names=parseModuleNameOrGroup(ctx);
		System.out.println("names = "+names);
		names.forEach(module->importModule(module,statementVisitor));
	}

	public String getFullModuleName(Nutt.Module_nameContext ctx)
	{
		return ctx.NAME().stream().map(TerminalNode::getText).collect(Collectors.joining("\\\\"));
	}
}