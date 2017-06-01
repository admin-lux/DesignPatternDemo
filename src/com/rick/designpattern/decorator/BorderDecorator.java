package com.rick.designpattern.decorator;

/**
 * Created by MyPC on 2017/6/1.
 */
public class BorderDecorator extends Decorator {
    private int mWidth;

    public BorderDecorator(VisualComponent mVisualComponent, int width) {
        super(mVisualComponent);
        this.mWidth = width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("BorderDecorator is draw in " + mWidth);
    }
}
