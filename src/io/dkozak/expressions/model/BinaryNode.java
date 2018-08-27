
package io.dkozak.expressions.model;


import java.util.function.BiFunction;

/**
 * Represents a binary operation in the AST
 *
 * @author dkozak
 */
public class BinaryNode extends ExpressionNode {

    /**
     * Fuction used for evaluating this node.
     */
    public final BiFunction<Integer, Integer, Integer> operation;

    public ExpressionNode left = null;

    public ExpressionNode right = null;

    public BinaryNode(BiFunction<Integer, Integer, Integer> operation) {
        this.operation = operation;
    }

    /**
     * Function for evaluation, internal visitor pattern.
     *
     * @return result from evaluating the whole subtree
     */
    public int compute() {
        return operation.apply(left.compute(), right.compute());
    }
}
