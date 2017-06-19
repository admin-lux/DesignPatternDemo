package com.rick.designpattern.observer;

/**
 * Created by MyPC on 2017/6/19.
 */
public class Client {


    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        AnalogClock analogClock = new AnalogClock(clockTimer);
        clockTimer.tick();
    }
}
