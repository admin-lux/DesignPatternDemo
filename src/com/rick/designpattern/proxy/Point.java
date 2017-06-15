package com.rick.designpattern.proxy;

/**
 * Created by MyPC on 2017/6/15.
 */
public class Point {

    private int textSize;
    private int textColor;

    public Point() {
    }

    public int getTextColor() {

        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getTextSize() {

        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public Point(int textSize, int textColor) {

        this.textSize = textSize;
        this.textColor = textColor;
    }
}
