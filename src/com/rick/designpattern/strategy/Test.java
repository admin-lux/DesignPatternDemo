package com.rick.designpattern.strategy;

/**
 * Created by MyPC on 2017/6/1.
 */
public class Test {


    public static void main(String[] args) {
        PersonContext personContext = null;
        personContext = new PersonContext(new AirPlaneStrategy());
        personContext.travel();
        personContext = new PersonContext(new BicycleStrategy());
        personContext.travel();
        personContext = new PersonContext(new TrainStrategy());
        personContext.travel();
    }
}
