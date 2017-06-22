package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class Client {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        BombedMazeFactory bombedMazeFactory = BombedMazeFactory.instance();
        mazeGame.createMaze(bombedMazeFactory);
    }
}
