package com.rick.designpattern.abstract_factory2;

/**
 * Created by MyPC on 2017/6/20.
 */
public class EnchantedMazeFactory extends MazeFactory {

    public EnchantedMazeFactory() {
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
