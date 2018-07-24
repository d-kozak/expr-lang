package io.dkozak.expressions.model;

public class UnfinishedNode extends ExpressionNode {

    @Override
    public int compute() {
        throw new UnsupportedOperationException("Cannot compute unfinished node");
    }
}
