package com.rick.designpattern.factory_method;

/**
 * Created by MyPC on 2017/6/21.
 */
public class Door {
    private Room r1, r2;

    public Door(Room r1, Room r2) {
        this.r1 = r1;
        this.r2 = r2;
    }
}
