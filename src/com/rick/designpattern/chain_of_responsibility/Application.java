package com.rick.designpattern.chain_of_responsibility;

/**
 * Created by MyPC on 2017/6/16.
 */
public class Application extends HelpHandler {
    public Application(int topic) {
        super(null, topic);
    }

    @Override
    public void handleHelp() {
        System.out.println("Application is handleHelp");
    }
}
