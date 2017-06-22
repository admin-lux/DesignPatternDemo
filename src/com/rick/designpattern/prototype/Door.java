package com.rick.designpattern.prototype;

/**
 * 门
 * <p>
 * Created by MyPC on 2017/6/20.
 */
public class Door {
    private Room r1, r2;

    public Door() {

    }

    public Door(Door other) {
        r1 = other.r1;
        r2 = other.r2;
    }

    public void initialize(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public Door clone() {
        return new Door(this);
    }

    public Door(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
}
