package com.rick.designpattern.prototype;

/**
 * Created by MyPC on 2017/6/20.
 */
public class Client {

    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        MazePrototypeFactory mazePrototypeFactory =
                new MazePrototypeFactory(new Maze(), new Wall(), new Room(1), new Door());

        mazeGame.createMaze(mazePrototypeFactory);

        MazePrototypeFactory mazePrototypeFactory2 =
                new MazePrototypeFactory(new Maze(), new BombedWall(), new RoomWithABomb(1), new Door());

        mazeGame.createMaze(mazePrototypeFactory2);
    }
}
