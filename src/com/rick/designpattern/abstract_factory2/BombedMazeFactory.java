package com.rick.designpattern.abstract_factory2;

/**
 * Created by MyPC on 2017/6/20.
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n) {
        return new RoomWithABomb(n);
    }
}
