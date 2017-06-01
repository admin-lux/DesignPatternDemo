package com.rick.designpattern.decorator;

/**
 * Created by MyPC on 2017/6/1.
 */
public class Decorator extends VisualComponent {
    private VisualComponent mVisualComponent;

    public Decorator(VisualComponent mVisualComponent) {
        this.mVisualComponent = mVisualComponent;
    }

    @Override
    public void draw() {
        mVisualComponent.draw();
    }
}
