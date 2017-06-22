package com.rick.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 房间
 * <p>
 * Created by MyPC on 2017/6/20.
 */
public class Room {
    private int n;
    private Map<String, Object> wallAndRoomMap = new HashMap<String, Object>();

    public Room(int n) {
        this.n = n;
    }

    public void setSide(String direction, Object o) {
        wallAndRoomMap.put(direction, o);
    }


}
