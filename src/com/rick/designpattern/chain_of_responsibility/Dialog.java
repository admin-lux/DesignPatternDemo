package com.rick.designpattern.chain_of_responsibility;

/**
 * Created by MyPC on 2017/6/16.
 */
public class Dialog extends Widget {

    public Dialog(HelpHandler helpHandler, int topic) {
        super(null, topic);
        setHandler(helpHandler, topic);
    }


    @Override
    public void handleHelp() {
        if (hasHelp()) {
            System.out.println("Dialog is handleHelp");
        } else {
            super.handleHelp();
        }
    }
}
