package com.rick.designpattern.proxy;

/**
 * Created by MyPC on 2017/6/15.
 */
public class Event {

    private int x,y;

    public Event() {
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Event(int x, int y) {

        this.x = x;
        this.y = y;
    }
}
