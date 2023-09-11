package Nutt.ModuleManager;

import Nutt.Interpreter.NuttInterpreter;
import Nutt.NuttCommon;
import Nutt.NuttEnvironment;
import Nutt.Runtime.NativeLoader;
import Nutt.Visitors.NuttStatementVisitor;
import gen.NuttParser;
import gen.NuttParser.Module_importContext;
import gen.NuttParser.Module_name_or_groupContext;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Loader
{
	public static String importModule(String modulePath)
	{
		if(modulePath.startsWith("native."))
		{
			var procedure=NativeLoader.loadNativeProcedure(modulePath.replace("\\\\","."));
			NuttInterpreter.currentScope.addProcedure(procedure.getName(),procedure);
			return modulePath;
		}
		var chunk=NuttEnvironment.getTempParser(NuttCommon.readFileString("modules\\%s.nutt".formatted(modulePath))).chunk();
		var module=chunk.module();
		if(module==null) return modulePath;
		importModuleList(module.module_import());
		var block=module.block();
		if(block==null) return modulePath;
		block.stat().forEach(new NuttStatementVisitor()::visit);
		return modulePath;
	}

	public static List<String> parseModuleNameOrGroup(Module_name_or_groupContext ctx)
	{
		if(ctx.module_name()!=null) return List.of(getModuleName(ctx.module_name()));
		var groupPrefix=getModuleName(ctx.module_group().module_name())+".";
		var nameList=new ArrayList<String>();
		for(var moduleName: ctx.module_group().module_list().module_name_or_group())
		{
			if(moduleName.module_name()!=null) nameList.add(groupPrefix+getModuleName(moduleName.module_name()));
			else nameList.addAll(parseModuleNameOrGroup(moduleName).stream().map(i->groupPrefix+i).toList());
		}
		return nameList;
	}

	public static void importModuleList(List<Module_importContext> importContexts)
	{
		importContexts.forEach(Loader::importModuleContext);
	}

	public static void importModuleContext(Module_importContext importContext)
	{
		if(importContext.module_list()==null) return;
		importContext.module_list()
		             .module_name_or_group()
		             .forEach(Loader::importModuleGroup);
	}

	private static void importModuleGroup(Module_name_or_groupContext ctx)
	{
		parseModuleNameOrGroup(ctx).forEach(Loader::importModule);
	}

	public static String getModuleName(NuttParser.Module_nameContext ctx)
	{
		return ctx.NAME()
		          .stream()
		          .map(TerminalNode::getText)
		          .collect(Collectors.joining("\\\\"));
	}
}
