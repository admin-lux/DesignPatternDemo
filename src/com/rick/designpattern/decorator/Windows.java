package com.rick.designpattern.decorator;

/**
 * Created by MyPC on 2017/6/1.
 */
public class Windows {

    public void setContent(VisualComponent visualComponent) {
        System.out.println("window is content");
        visualComponent.draw();
    }
}
