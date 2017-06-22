package com.rick.designpattern.prototype;

/**
 * Created by MyPC on 2017/6/22.
 */
public class MazePrototypeFactory extends MazeFactory {
    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Room _prototypeRoom;
    private Door _prototypeDoor;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        this._prototypeMaze = maze;
        this._prototypeWall = wall;
        this._prototypeRoom = room;
        this._prototypeDoor = door;
    }

    public Maze makeMaxe() {
        return new Maze();
    }

    public Wall makeWall() {
        return _prototypeWall.clone();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        Door door = _prototypeDoor.clone();
        door.initialize(r1, r2);
        return door;
    }

}
