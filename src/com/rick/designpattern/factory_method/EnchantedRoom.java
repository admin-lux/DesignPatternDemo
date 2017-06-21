package com.rick.designpattern.factory_method;

/**
 * Created by MyPC on 2017/6/21.
 */
public class EnchantedRoom extends Room {
    private Spell spell;

    public EnchantedRoom(int n, Spell spell) {
        super(n);
        this.spell = spell;
    }
}
