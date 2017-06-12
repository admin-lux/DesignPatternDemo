package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Watt {
    private float powerx;

    public Watt(float powerx) {
        this.powerx = powerx;
    }

    public float getPowerx() {
        return powerx;
    }

    public void setPowerx(float powerx) {
        this.powerx = powerx;
    }
}
