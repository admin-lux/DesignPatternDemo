package com.rick.designpattern.singleton;

/**
 * Created by MyPC on 2017/6/20.
 */
public class EnchantedRoom extends Room {
    private Spell spell;

    public EnchantedRoom(int n, Spell spell) {
        super(n);
        this.spell = spell;
    }
}
