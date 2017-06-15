package com.rick.designpattern.proxy;

/**
 * Created by MyPC on 2017/6/15.
 */
public class Client {

    public static void main(String[] args) {
        TextDocument textDocument = new TextDocument();
        textDocument.insert(new ImageProxy("test.txt"));
    }
}
