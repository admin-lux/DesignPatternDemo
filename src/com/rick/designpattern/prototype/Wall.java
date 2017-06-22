package com.rick.designpattern.prototype;

/**
 * 墙
 * <p>
 * Created by MyPC on 2017/6/20.
 */
public class Wall {

    public Wall() {

    }

    public Wall(Wall other) {
        
    }

    public Wall clone() {
        return new Wall(this);
    }
}
