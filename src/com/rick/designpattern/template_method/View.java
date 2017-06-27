package com.rick.designpattern.template_method;

/**
 * Created by MyPC on 2017/6/27.
 */
public class View {


    public void display() {
        setFocus();
        doDisplay();
        resetFocus();
    }

    protected void doDisplay() {

    }

    protected void setFocus() {

    }

    protected void resetFocus() {

    }


}
