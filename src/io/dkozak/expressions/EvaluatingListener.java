package io.dkozak.expressions;

import io.dkozak.expressions.model.BinaryNode;
import io.dkozak.expressions.model.ExpressionNode;
import io.dkozak.expressions.model.TerminalNode;
import io.dkozak.expressions.model.UnfinishedNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;
import java.util.function.BiFunction;

public class EvaluatingListener extends ExpressionsBaseListener {

    private final Map<String, Integer> context;

    private String currentVarName;

    private Deque<ExpressionNode> nodes = new ArrayDeque<>();

    public EvaluatingListener(Map<String, Integer> context) {
        this.context = context;
    }

    @Override
    public void enterAssignment(ExpressionsParser.AssignmentContext ctx) {
        currentVarName = ctx.VAR()
                            .getText();
        nodes.add(new UnfinishedNode());
    }

    @Override
    public void exitAssignment(ExpressionsParser.AssignmentContext ctx) {
        ExpressionNode expressionNode = nodes.removeLast();
        context.put(currentVarName, expressionNode.compute());
        currentVarName = null;
    }

    @Override
    public void enterPrint(ExpressionsParser.PrintContext ctx) {
        nodes.addLast(new UnfinishedNode());
    }

    @Override
    public void exitPrint(ExpressionsParser.PrintContext ctx) {
        ExpressionNode expressionNode = nodes.removeLast();
        System.out.println(expressionNode.compute());
    }

    private void enterExpr(BiFunction<Integer, Integer, Integer> function) {
        ExpressionNode last = nodes.getLast();
        BinaryNode newNode = new BinaryNode(function);
        addNewChildNode(last, newNode);
        nodes.addLast(newNode);
    }

    private void exitExpr() {
        // always leave the top node in the stack, so that print and assignment can take it from there
        if (nodes.size() > 1)
            nodes.removeLast();
    }

    private void appendValue(int value) {
        ExpressionNode last = nodes.getLast();
        TerminalNode newNode = new TerminalNode(value);
        addNewChildNode(last, newNode);
    }

    private void addNewChildNode(ExpressionNode last, ExpressionNode newNode) {
        if (last instanceof BinaryNode) {
            BinaryNode bin = (BinaryNode) last;
            if (bin.left == null) {
                bin.left = newNode;
            } else if (bin.right == null) {
                bin.right = newNode;
            } else {
                throw new IllegalStateException("Both left and right children of current binary node are set");
            }
        } else if (last instanceof UnfinishedNode) {
            nodes.removeLast();
            nodes.addLast(newNode);
        } else if (last instanceof TerminalNode) {
            nodes.removeLast();
            nodes.addLast(newNode);
            ((BinaryNode) newNode).left = last;
        }
    }

    @Override
    public void enterVar(ExpressionsParser.VarContext ctx) {
        String varName = ctx.VAR()
                            .getText();
        Integer value = context.get(varName);
        if (value == null) {
            System.err.println("Unknown variable " + varName + ", using -1 instead");
            value = -1;
        }
        appendValue(value);
    }

    @Override
    public void enterInt(ExpressionsParser.IntContext ctx) {
        appendValue(Integer.parseInt(ctx.INT()
                                        .getText()));
    }

    @Override
    public void enterPlus(ExpressionsParser.PlusContext ctx) {
        enterExpr((x, y) -> x + y);
    }

    @Override
    public void enterMinus(ExpressionsParser.MinusContext ctx) {
        enterExpr((x, y) -> x - y);
    }

    @Override
    public void enterMult(ExpressionsParser.MultContext ctx) {
        enterExpr((x, y) -> x * y);
    }

    @Override
    public void enterDiv(ExpressionsParser.DivContext ctx) {
        enterExpr((x, y) -> x / y);
    }

    @Override
    public void exitPlus(ExpressionsParser.PlusContext ctx) {
        exitExpr();
    }

    @Override
    public void exitMinus(ExpressionsParser.MinusContext ctx) {
        exitExpr();
    }

    @Override
    public void exitMult(ExpressionsParser.MultContext ctx) {
        exitExpr();
    }

    @Override
    public void exitDiv(ExpressionsParser.DivContext ctx) {
        exitExpr();
    }


    @Override
    public void enterBracket(ExpressionsParser.BracketContext ctx) {
        // do nothing
    }

    @Override
    public void exitBracket(ExpressionsParser.BracketContext ctx) {
        // do nothing
    }
}
