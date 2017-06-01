package com.rick.designpattern.decorator;

/**
 * Created by MyPC on 2017/6/1.
 */
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(VisualComponent mVisualComponent) {
        super(mVisualComponent);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("ScrollDecorator is draw");
    }
}
