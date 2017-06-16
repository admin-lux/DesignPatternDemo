package com.rick.designpattern.chain_of_responsibility;

/**
 * Created by MyPC on 2017/6/16.
 */
public class Widget extends HelpHandler {

    public Widget(Widget parent, int topic) {
        super(parent, topic);
    }
}
