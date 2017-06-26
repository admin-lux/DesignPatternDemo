package com.rick.designpattern.bridge2;

/**
 * Created by MyPC on 2017/6/26.
 */
public class Client {

    public static void main(String[] args) {
        SmallBrushPenRefinedAbstraction smallBrushPenRefinedAbstraction = new SmallBrushPenRefinedAbstraction();
        smallBrushPenRefinedAbstraction.setImplementorColor(new ConcreteImplementorBlack());
        smallBrushPenRefinedAbstraction.operationDraw();
    }
}
