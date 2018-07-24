// Generated from /home/dkozak/IdeaProjects/expressions/src/io/dkozak/expressions/Expressions.g4 by ANTLR 4.7
package io.dkozak.expressions;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface ExpressionsVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link ExpressionsParser#start}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart(ExpressionsParser.StartContext ctx);

    /**
     * Visit a parse tree produced by {@link ExpressionsParser#stat}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStat(ExpressionsParser.StatContext ctx);

    /**
     * Visit a parse tree produced by {@link ExpressionsParser#assignment}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssignment(ExpressionsParser.AssignmentContext ctx);

    /**
     * Visit a parse tree produced by {@link ExpressionsParser#print}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrint(ExpressionsParser.PrintContext ctx);

    /**
     * Visit a parse tree produced by the {@code div}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDiv(ExpressionsParser.DivContext ctx);

    /**
     * Visit a parse tree produced by the {@code minus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMinus(ExpressionsParser.MinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code mult}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult(ExpressionsParser.MultContext ctx);

    /**
     * Visit a parse tree produced by the {@code var}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar(ExpressionsParser.VarContext ctx);

    /**
     * Visit a parse tree produced by the {@code bracket}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracket(ExpressionsParser.BracketContext ctx);

    /**
     * Visit a parse tree produced by the {@code int}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInt(ExpressionsParser.IntContext ctx);

    /**
     * Visit a parse tree produced by the {@code plus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlus(ExpressionsParser.PlusContext ctx);
}