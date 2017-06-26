package com.rick.designpattern.bridge2;

/**
 * Created by MyPC on 2017/6/26.
 */
public abstract class BrushPenAbstraction {
    protected ImplementorColor implementorColor;


    public void setImplementorColor(ImplementorColor implementorColor) {
        this.implementorColor = implementorColor;
    }

    public abstract void operationDraw();

}
