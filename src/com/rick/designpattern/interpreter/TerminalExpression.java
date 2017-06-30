package com.rick.designpattern.interpreter;

/**
 * Created by MyPC on 2017/6/30.
 */
public class TerminalExpression extends AbstractExpression {
    private int i;

    public TerminalExpression(int i) {
        this.i = i;
    }

    @Override
    public int interpreter(Context context) {
        return this.i;
    }
}
