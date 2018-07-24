// Generated from /home/dkozak/IdeaProjects/expressions/src/io/dkozak/expressions/Expressions.g4 by ANTLR 4.7
package io.dkozak.expressions;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionsParser}.
 */
public interface ExpressionsListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ExpressionsParser#start}.
     *
     * @param ctx the parse tree
     */
    void enterStart(ExpressionsParser.StartContext ctx);

    /**
     * Exit a parse tree produced by {@link ExpressionsParser#start}.
     *
     * @param ctx the parse tree
     */
    void exitStart(ExpressionsParser.StartContext ctx);

    /**
     * Enter a parse tree produced by {@link ExpressionsParser#stat}.
     *
     * @param ctx the parse tree
     */
    void enterStat(ExpressionsParser.StatContext ctx);

    /**
     * Exit a parse tree produced by {@link ExpressionsParser#stat}.
     *
     * @param ctx the parse tree
     */
    void exitStat(ExpressionsParser.StatContext ctx);

    /**
     * Enter a parse tree produced by {@link ExpressionsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void enterAssignment(ExpressionsParser.AssignmentContext ctx);

    /**
     * Exit a parse tree produced by {@link ExpressionsParser#assignment}.
     *
     * @param ctx the parse tree
     */
    void exitAssignment(ExpressionsParser.AssignmentContext ctx);

    /**
     * Enter a parse tree produced by {@link ExpressionsParser#print}.
     *
     * @param ctx the parse tree
     */
    void enterPrint(ExpressionsParser.PrintContext ctx);

    /**
     * Exit a parse tree produced by {@link ExpressionsParser#print}.
     *
     * @param ctx the parse tree
     */
    void exitPrint(ExpressionsParser.PrintContext ctx);

    /**
     * Enter a parse tree produced by the {@code div}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterDiv(ExpressionsParser.DivContext ctx);

    /**
     * Exit a parse tree produced by the {@code div}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitDiv(ExpressionsParser.DivContext ctx);

    /**
     * Enter a parse tree produced by the {@code minus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMinus(ExpressionsParser.MinusContext ctx);

    /**
     * Exit a parse tree produced by the {@code minus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMinus(ExpressionsParser.MinusContext ctx);

    /**
     * Enter a parse tree produced by the {@code mult}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMult(ExpressionsParser.MultContext ctx);

    /**
     * Exit a parse tree produced by the {@code mult}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMult(ExpressionsParser.MultContext ctx);

    /**
     * Enter a parse tree produced by the {@code var}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterVar(ExpressionsParser.VarContext ctx);

    /**
     * Exit a parse tree produced by the {@code var}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitVar(ExpressionsParser.VarContext ctx);

    /**
     * Enter a parse tree produced by the {@code bracket}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBracket(ExpressionsParser.BracketContext ctx);

    /**
     * Exit a parse tree produced by the {@code bracket}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBracket(ExpressionsParser.BracketContext ctx);

    /**
     * Enter a parse tree produced by the {@code int}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterInt(ExpressionsParser.IntContext ctx);

    /**
     * Exit a parse tree produced by the {@code int}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitInt(ExpressionsParser.IntContext ctx);

    /**
     * Enter a parse tree produced by the {@code plus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPlus(ExpressionsParser.PlusContext ctx);

    /**
     * Exit a parse tree produced by the {@code plus}
     * labeled alternative in {@link ExpressionsParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPlus(ExpressionsParser.PlusContext ctx);
}