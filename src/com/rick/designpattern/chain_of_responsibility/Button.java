package com.rick.designpattern.chain_of_responsibility;

/**
 * Created by MyPC on 2017/6/16.
 */
public class Button extends Dialog {

    public Button(Dialog parent, int topic) {
        super(parent, topic);
    }

    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Button is handleHelp");
        } else {
            super.handleHelp();
        }
    }
}
