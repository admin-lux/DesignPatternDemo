package com.rick.designpattern.decorator;

/**
 * Created by MyPC on 2017/6/1.
 */
public class TextView extends VisualComponent {
    private String mText;

    public TextView(String mText) {
        this.mText = mText;
    }

    @Override
    public void draw() {
        System.out.println("TextView is draw in " + mText);
    }
}
