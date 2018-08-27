package io.dkozak.expressions.model;

/**
 * Abstract class for any node in expression AST.
 *
 * @author dkozak
 */
public abstract class ExpressionNode {

    /**
     * Evaluates the whole subtree using internal tree visitor pattern.
     *
     * @return
     */
    public abstract int compute();
}
