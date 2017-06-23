package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public class Button extends Widget {
    private String buttonText;

    public Button(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void setText(String text) {
        this.buttonText = text;
        System.out.println(text);
    }

    @Override
    public void handleMouse(MouseEvent mouseEvent) {
        changed();
    }
}
