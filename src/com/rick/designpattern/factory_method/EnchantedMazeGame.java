package com.rick.designpattern.factory_method;

/**
 * Created by MyPC on 2017/6/21.
 */
public class EnchantedMazeGame extends MazeGame {
    private Spell castSpell() {
        return new Spell();
    }

    @Override
    public Room makeRoom(int n) {
        return new EnchantedRoom(n, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
