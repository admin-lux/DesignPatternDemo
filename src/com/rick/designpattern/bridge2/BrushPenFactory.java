package com.rick.designpattern.bridge2;

/**
 * Created by MyPC on 2017/6/26.
 */
public class BrushPenFactory {
    private static BrushPenFactory _instance;
    private BrushPenAbstraction _BrushPenAbstraction;

    private BrushPenFactory() {
    }

    public static BrushPenFactory instance() {
        if (null == _instance) {
            _instance = new BrushPenFactory();
        }
        return _instance;
    }

    public BrushPenAbstraction makeBrushPen() {
        _BrushPenAbstraction = new SmallBrushPenRefinedAbstraction();
        _BrushPenAbstraction.setImplementorColor(new ConcreteImplementorBlack());
        return _BrushPenAbstraction;
    }
}
