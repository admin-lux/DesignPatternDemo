package com.rick.designpattern.factory_method;

/**
 * Created by MyPC on 2017/6/21.
 */
public class MazeGame {

    public Maze createMaze() {
        Maze aMaze = new Maze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);

        Door theDoor = makeDoor(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Room.Side.North, makeWall());
        r1.setSide(Room.Side.East, theDoor);
        r1.setSide(Room.Side.South, makeWall());
        r1.setSide(Room.Side.West, makeWall());

        r2.setSide(Room.Side.North, makeWall());
        r2.setSide(Room.Side.East, makeWall());
        r2.setSide(Room.Side.South, makeWall());
        r2.setSide(Room.Side.West, theDoor);
        return aMaze;
    }


    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
