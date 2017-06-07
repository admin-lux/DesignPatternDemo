package com.rick.designpattern.flyweight3;

/**
 * 具体享元角色
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;


    public ConcreteFlyweight(Object state) {
        this.intrinsicState = String.valueOf(state);
    }

    @Override
    public void operation(Object state) {
        System.out.println("ConcreteFlyweight operation, Intrinsic State = " + intrinsicState
                + "; Extrinsic State = " + String.valueOf(state) + ";<br />");
    }


}
