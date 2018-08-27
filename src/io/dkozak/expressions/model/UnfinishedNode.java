package io.dkozak.expressions.model;

/**
 * Temporarily inserted node which is meant for replacement later
 *
 * @author dkozak
 */
public class UnfinishedNode extends ExpressionNode {

    @Override
    public int compute() {
        throw new UnsupportedOperationException("Cannot compute unfinished node");
    }
}
