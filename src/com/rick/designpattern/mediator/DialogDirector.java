package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public abstract class DialogDirector {


    public DialogDirector() {
    }

    public abstract void showDialog();

    public abstract void widgetChanged(Widget widget);

    public abstract void createWidgets();
}
