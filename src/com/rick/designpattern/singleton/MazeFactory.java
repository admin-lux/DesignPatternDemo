package com.rick.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MyPC on 2017/6/20.
 */
public class MazeFactory {
    private static MazeFactory _instance;

    protected MazeFactory() {
    }

    public static MazeFactory instance(String name) {
        if (null == _instance) {
            _instance = new MazeFactory();
        }
        return _instance;
    }

    public Maze makeMaxe() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
