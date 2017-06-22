package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class Client {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        BombedMazeFactory bombedMazeFactory = (BombedMazeFactory) MazeFactory.instance(BombedMazeFactory.class.getName());
        mazeGame.createMaze(bombedMazeFactory);


        BombedMazeFactory_Lazy bombedMazeFactory_lazy = BombedMazeFactory_Lazy.instance();
        mazeGame.createMaze(bombedMazeFactory_lazy);

        BombedMazeFactory_Hungry bombedMazeFactory_hungry = BombedMazeFactory_Hungry.instance();
        mazeGame.createMaze(bombedMazeFactory_hungry);

    }
}
