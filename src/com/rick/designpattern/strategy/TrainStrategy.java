package com.rick.designpattern.strategy;

/**
 * Created by MyPC on 2017/6/1.
 */
public class TrainStrategy  extends TravelStrategy{

    @Override
    public void travel() {
        System.out.println("travel is train");
    }
}
