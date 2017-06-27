package com.rick.designpattern.template_method;

/**
 * Created by MyPC on 2017/6/27.
 */
public class Client {


    public static void main(String[] args) {
        View view = new MyView();
        view.display();
    }
}
