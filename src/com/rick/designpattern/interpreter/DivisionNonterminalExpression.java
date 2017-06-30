package com.rick.designpattern.interpreter;

/**
 * Created by MyPC on 2017/6/30.
 */
public class DivisionNonterminalExpression extends AbstractExpression {
    private final AbstractExpression left, right;

    public DivisionNonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        final int value = this.right.interpreter(context);
        if (value != 0) {
            return this.left.interpreter(context) / value;
        }
        return -1111;
    }
}
