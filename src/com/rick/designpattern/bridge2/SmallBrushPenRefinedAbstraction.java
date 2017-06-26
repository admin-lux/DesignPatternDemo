package com.rick.designpattern.bridge2;

/**
 * Created by MyPC on 2017/6/26.
 */
public class SmallBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public void operationDraw() {
        System.out.println("Small and " + implementorColor.bepaint() + " drawing");
    }
}
