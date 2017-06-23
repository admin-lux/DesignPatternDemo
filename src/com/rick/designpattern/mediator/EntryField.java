package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public class EntryField extends Widget {
    private String text;

    public EntryField(DialogDirector dialogDirector) {
        super(dialogDirector);
    }

    public void setText(String text) {
        this.text = text;
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    @Override
    public void handleMouse(MouseEvent mouseEvent) {

    }
}
