package com.rick.designpattern.bridge;

/**
 * Created by MyPC on 2017/6/26.
 */
public class ApplicationWindow extends Window {
    public ApplicationWindow(View contents) {
        super(contents);
    }

    @Override
    public void drawContents() {
        getView().drawOn(this);
    }

    @Override
    public void close() {

    }

    @Override
    public void iconify() {

    }

    @Override
    public void deiconify() {

    }

    @Override
    public void setOrigin(Point at) {

    }

    @Override
    public void setExtent(Point extent) {

    }

    @Override
    public void raise() {

    }

    @Override
    public void lower() {

    }

    @Override
    public void drawLing(Point at, Point extent) {

    }

    @Override
    public void drawRect(Point at, Point extent) {

    }

    @Override
    public void drawPolygon(Point[] at, int n) {

    }

    @Override
    public void drawText(String text, Point at) {

    }
}
