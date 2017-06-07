package com.rick.designpattern.flyweight2;

/**
 * Created by MyPC on 2017/6/7.
 */
public class Artist {
    //内部状态
    private String name;

    public Artist() {
    }

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
