package com.rick.designpattern.abstract_factory2;

/**
 * Created by MyPC on 2017/6/20.
 */
public class MazeGame {

    public Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaxe();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door door = factory.makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide("north", factory.makeWall());
        r1.setSide("east", door);
        r1.setSide("south", factory.makeWall());
        r1.setSide("west", factory.makeWall());
        r2.setSide("north", factory.makeWall());
        r2.setSide("east", factory.makeWall());
        r2.setSide("south", factory.makeWall());
        r2.setSide("west", door);
        return maze;

    }
}
