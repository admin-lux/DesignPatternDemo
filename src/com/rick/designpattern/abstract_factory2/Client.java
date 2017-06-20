package com.rick.designpattern.abstract_factory2;

/**
 * Created by MyPC on 2017/6/20.
 */
public class Client {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        BombedMazeFactory bombedMazeFactory = new BombedMazeFactory();
        mazeGame.createMaze(bombedMazeFactory);
    }
}
