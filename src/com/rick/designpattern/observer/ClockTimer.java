package com.rick.designpattern.observer;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MyPC on 2017/6/19.
 */
public class ClockTimer extends Subject {
    private int hour, minute, second;

    public ClockTimer() {
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Date date = new Date(System.currentTimeMillis());
                    hour = date.getHours();
                    minute = date.getMinutes();
                    second = date.getSeconds();
                    ClockTimer.this.Notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).run();
    }


}