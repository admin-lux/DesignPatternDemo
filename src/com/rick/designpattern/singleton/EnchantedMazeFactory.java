package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class EnchantedMazeFactory extends MazeFactory {
    private static EnchantedMazeFactory _instance;

    private EnchantedMazeFactory() {
    }

    public static EnchantedMazeFactory instance() {
        if (null == _instance) {
            _instance = new EnchantedMazeFactory();
        }
        return _instance;
    }

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    private Spell castSpell() {
        return new Spell();
    }
}
