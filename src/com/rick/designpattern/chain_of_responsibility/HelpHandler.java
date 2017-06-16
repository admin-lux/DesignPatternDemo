package com.rick.designpattern.chain_of_responsibility;

/**
 * Created by MyPC on 2017/6/16.
 */
public class HelpHandler {
    public static final int NO_HELP_TOPIC = -1;

    private HelpHandler successor;
    private int topic;


    public HelpHandler(HelpHandler helpHandler, int topic) {
        this.successor = helpHandler;
        this.topic = topic;
    }

    public void setHandler(HelpHandler h, int topic) {
        this.successor = h;
        this.topic = topic;
    }

    public boolean hasHelp() {
        return topic != NO_HELP_TOPIC;
    }

    public void handleHelp() {
        if (null != successor) {
            successor.handleHelp();
        }
    }
}
