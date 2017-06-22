package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedMazeFactory_Lazy extends MazeFactory {
    private static BombedMazeFactory_Lazy _instance;

    private BombedMazeFactory_Lazy() {
    }

    public static BombedMazeFactory_Lazy instance() {
        if (null == _instance) {
            _instance = new BombedMazeFactory_Lazy();
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
