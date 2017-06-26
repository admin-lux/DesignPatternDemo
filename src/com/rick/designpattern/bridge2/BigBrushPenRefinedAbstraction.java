package com.rick.designpattern.bridge2;

/**
 * Created by MyPC on 2017/6/26.
 */
public class BigBrushPenRefinedAbstraction extends BrushPenAbstraction {
    @Override
    public void operationDraw() {
        System.out.println("big and " + implementorColor.bepaint() + " drawing");
    }
}
