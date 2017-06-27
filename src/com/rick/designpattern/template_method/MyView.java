package com.rick.designpattern.template_method;

/**
 * Created by MyPC on 2017/6/27.
 */
public class MyView extends View {

    @Override
    protected void doDisplay() {
        System.out.println("MyView doDisplay");
    }
}
