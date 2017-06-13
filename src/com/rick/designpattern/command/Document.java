package com.rick.designpattern.command;

/**
 * Created by MyPC on 2017/6/13.
 */
public class Document {
    private String name;

    public Document(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Document in open is " + name);

    }

    public void paste() {
        System.out.println("Document in paste");
    }
}
