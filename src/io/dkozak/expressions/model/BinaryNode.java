package io.dkozak.expressions.model;


import java.util.function.BiFunction;

public class BinaryNode extends ExpressionNode {

    public final BiFunction<Integer, Integer, Integer> operation;

    public ExpressionNode left = null;

    public ExpressionNode right = null;

    public BinaryNode(BiFunction<Integer, Integer, Integer> operation) {
        this.operation = operation;
    }

    public int compute() {
        return operation.apply(left.compute(), right.compute());
    }
}
