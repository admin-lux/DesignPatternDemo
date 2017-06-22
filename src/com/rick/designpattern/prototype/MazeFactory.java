package com.rick.designpattern.prototype;

/**
 * Created by MyPC on 2017/6/20.
 */
public class MazeFactory {

    public MazeFactory() {
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
