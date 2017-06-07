package com.rick.designpattern.flyweight;

/**
 * Created by MyPC on 2017/6/7.
 */
public class Client {


    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("first");
        Flyweight flyweight2 = factory.getFlyweight("second");
    }
}
