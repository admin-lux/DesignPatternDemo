package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedMazeFactory_Hungry extends MazeFactory {
    private static BombedMazeFactory_Hungry _instance = new BombedMazeFactory_Hungry();

    private BombedMazeFactory_Hungry() {
    }

    public static BombedMazeFactory_Hungry instance() {
        return _instance;
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
