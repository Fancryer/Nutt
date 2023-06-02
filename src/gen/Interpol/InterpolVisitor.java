// Generated from F:/Nutt/src\Interpol.g4 by ANTLR 4.12.0
package gen.Interpol;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpolParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpolVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpolParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(InterpolParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolParser#interp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterp(InterpolParser.InterpContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(InterpolParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolParser#chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChars(InterpolParser.CharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpolParser#expInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInner(InterpolParser.ExpInnerContext ctx);
}