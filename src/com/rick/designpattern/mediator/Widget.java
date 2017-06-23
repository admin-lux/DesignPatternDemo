package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public abstract class Widget {
    private DialogDirector dialogDirector;

    public Widget(DialogDirector dialogDirector) {
        this.dialogDirector = dialogDirector;
    }

    public void changed() {
        dialogDirector.widgetChanged(this);
    }

    public abstract void handleMouse(MouseEvent mouseEvent);

}
