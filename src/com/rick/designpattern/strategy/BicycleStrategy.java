package com.rick.designpattern.strategy;

/**
 * Created by MyPC on 2017/6/1.
 */
public class BicycleStrategy extends TravelStrategy {
    @Override
    public void travel() {
        System.out.println("travel is bicycle");
    }
}
