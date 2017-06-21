package com.rick.designpattern.factory_method;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MyPC on 2017/6/21.
 */
public class Room {
    private int n;
    private Map<Side, Object> walls = new HashMap<Side, Object>();

    public Room(int n) {
        this.n = n;
    }

    public void setSide(Side side, Object o) {
        walls.put(side, o);
    }

    public enum Side {
        North, East, South, West;
    }
}
