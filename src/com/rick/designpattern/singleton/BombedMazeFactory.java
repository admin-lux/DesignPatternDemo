package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedMazeFactory extends MazeFactory {

    private static BombedMazeFactory _instance;

    private BombedMazeFactory() {
    }

    public static BombedMazeFactory instance() {
        if (null == _instance) {
            _instance = new BombedMazeFactory();
        }
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
