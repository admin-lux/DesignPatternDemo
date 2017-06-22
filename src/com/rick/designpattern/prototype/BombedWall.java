package com.rick.designpattern.prototype;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedWall extends Wall {
    private boolean _bomb;

    public BombedWall() {
    }

    public BombedWall(BombedWall other) {
        _bomb = other._bomb;
    }

    public BombedWall clone() {
        return new BombedWall(this);
    }
}
