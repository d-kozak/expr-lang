package io.dkozak.expressions.model;

/**
 * Represents leaf nodes, which always hold interger values.
 *
 * @author dkozak
 */
public class TerminalNode extends ExpressionNode {

    private final int value;

    public TerminalNode(int value) {
        this.value = value;
    }

    @Override
    public int compute() {
        return value;
    }
}
