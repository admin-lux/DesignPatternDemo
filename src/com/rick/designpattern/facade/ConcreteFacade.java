package com.rick.designpattern.facade;

/**
 * Created by MyPC on 2017/6/5.
 */
public class ConcreteFacade extends AbstractFacade {
    private AirConditioner mAirConditioner;
    private Fan mFan;
    private Light mLight;

    public ConcreteFacade() {
        mAirConditioner = new AirConditioner();
        mFan = new Fan();
        mLight = new Light();
    }

    @Override
    public void on() {
        mAirConditioner.on();
        mFan.on();
        mLight.on();
    }

    @Override
    public void off() {
        mAirConditioner.off();
        mFan.off();
        mLight.off();
    }
}
