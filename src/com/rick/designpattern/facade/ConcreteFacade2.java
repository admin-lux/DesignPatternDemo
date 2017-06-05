package com.rick.designpattern.facade;

/**
 * Created by MyPC on 2017/6/5.
 */
public class ConcreteFacade2 extends AbstractFacade {
    private AirConditioner mAirConditioner;
    private Fan mFan;
    private Light mLight;
    private Television mTelevision;

    public ConcreteFacade2() {
        mAirConditioner = new AirConditioner();
        mFan = new Fan();
        mLight = new Light();
        mTelevision = new Television();
    }

    @Override
    public void on() {
        mAirConditioner.on();
        mFan.on();
        mLight.on();
        mTelevision.on();
    }

    @Override
    public void off() {
        mAirConditioner.off();
        mFan.off();
        mLight.off();
        mTelevision.off();
    }
}
