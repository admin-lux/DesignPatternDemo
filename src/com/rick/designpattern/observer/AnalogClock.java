package com.rick.designpattern.observer;


/**
 * Created by MyPC on 2017/6/19.
 */
public class AnalogClock extends Observer implements Widget {
    private ClockTimer subject;

    public AnalogClock(ClockTimer subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void detachSubject() {
        subject.detach(this);
    }

    @Override
    public void draw() {
        System.out.println("AnalogClock：当前时间：" + subject.getHour() + ":" + subject.getMinute() + ":" + subject.getSecond());
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof ClockTimer) {
            draw();
        }
    }
}
