package com.rick.designpattern.factory_method;

/**
 * Created by MyPC on 2017/6/21.
 */
public class Client {


    public static void main(String[] args) {
        Maze maze = new MazeGame().createMaze();
        Maze maze1 = new BombedMazeGame().createMaze();
        Maze maze2 = new EnchantedMazeGame().createMaze();
    }
}
