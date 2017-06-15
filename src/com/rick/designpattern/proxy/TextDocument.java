package com.rick.designpattern.proxy;

/**
 * Created by MyPC on 2017/6/15.
 */
public class TextDocument {

    public TextDocument() {
    }

    public void insert(Graphic graphic) {
        graphic.draw(new Point(30, 0x777777));
    }
}
