package com.rick.designpattern.interpreter;

/**
 * Created by MyPC on 2017/6/30.
 */
public class Client {


    public static void main(String[] args) {
        Context context = new Context();
        context.addValue("a", 5);
        context.addValue("b", 4);
        context.addValue("c", 3);
        context.addValue("d", 2);

        AbstractExpression abstractExpression = new AddNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));
        System.out.println(abstractExpression.interpreter(context));
        AbstractExpression abstractExpression2 = new DivisionNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));
        System.out.println(abstractExpression2.interpreter(context));
        AbstractExpression abstractExpression3 = new MultiplyNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));
        System.out.println(abstractExpression3.interpreter(context));
        AbstractExpression abstractExpression4 = new SubtractNonterminalExpression(
                new TerminalExpression(context.getValue("a")), new TerminalExpression(context.getValue("b")));
        System.out.println(abstractExpression4.interpreter(context));

    }

}
