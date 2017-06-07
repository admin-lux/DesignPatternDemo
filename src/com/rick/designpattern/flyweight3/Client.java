package com.rick.designpattern.flyweight3;

/**
 * Created by MyPC on 2017/6/7.
 */
public class Client {


    public static void main(String[] args){
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight= flyweightFactory.getFlyweight("A");
        flyweight.operation("a");

        Flyweight flyweight1 = flyweightFactory.getFlyweight("B");
        flyweight1.operation("b");

        UnsharedConcreteFlyweight unsharedConcreteFlyweight = (UnsharedConcreteFlyweight) flyweightFactory.getFlyweight(new String[]{"C","D"});
        unsharedConcreteFlyweight.operation("c,d");

    }
}
