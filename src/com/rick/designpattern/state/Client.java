package com.rick.designpattern.state;

/**
 * Created by MyPC on 2017/6/2.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        context.open();
        context.close();
        context.open();
//        context.run();
        context.stop();
        context.stop();
        context.run();
        context.stop();
    }
}
