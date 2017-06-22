package com.rick.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MyPC on 2017/6/20.
 */
public class MazeFactory {
    private static Map<String, MazeFactory> _instances = new HashMap<String, MazeFactory>();

    static {
        _instances.put(MazeFactory.class.getName(), new MazeFactory());
    }

    protected MazeFactory() {
    }

    public static MazeFactory instance(String name) {
        if (null == name || "".equals(name)) {
            name = MazeFactory.class.getName();
        }
        if (null == _instances.get(name)) {
            try {
                _instances.put(name, lookUp(name));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
        return _instances.get(name);
    }

    public static void register(String name, MazeFactory mazeFactory) {
        _instances.put(name, mazeFactory);
    }

    public static MazeFactory lookUp(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return _instances.put(name, (MazeFactory) Class.forName(name).newInstance());
    }

    public Maze makeMaxe() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int n) {
        return new Room(n);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
