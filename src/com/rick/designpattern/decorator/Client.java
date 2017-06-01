package com.rick.designpattern.decorator;


/**
 * Created by MyPC on 2017/6/1.
 */
public class Client {

    public static void  main(String[] args){
        Windows windows = new Windows();
        windows.setContent(new ScrollDecorator(new BorderDecorator(new TextView("E:\\works\\XinLinDoctor\\demo\\DesignPatternDemo_GitHub>"), 1)));
    }
}
