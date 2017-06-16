package com.rick.designpattern.chain_of_responsibility;

import com.rick.designpattern.visitor.PricingVisitor;

/**
 * Created by MyPC on 2017/6/16.
 */
public class Client {
    public static final int PRINT_TOPIC = 1, PAPER_ORIENTATION_TOPIC = 2, APPLICATION_TOPIC = 3;


    public static void main(String[] args) {
        Application application = new Application(APPLICATION_TOPIC);
        Dialog dialog = new Dialog(application, PRINT_TOPIC);
        Button button = new Button(dialog, HelpHandler.NO_HELP_TOPIC);

        button.handleHelp();
    }
}
