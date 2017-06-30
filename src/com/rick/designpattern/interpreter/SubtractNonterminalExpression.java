package com.rick.designpattern.interpreter;

/**
 * Created by MyPC on 2017/6/30.
 */
public class SubtractNonterminalExpression extends AbstractExpression {
    private final AbstractExpression left, right;

    public SubtractNonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return this.left.interpreter(context) - this.right.interpreter(context);
    }
}
