package com.rick.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Inventory {
    private List<Equipment> equipmentList = new ArrayList<Equipment>();

    public void accumulate(Equipment equipment) {
        equipmentList.add(equipment);
    }

    public int getAccumulate() {
        int total = 0;
        for (Equipment equipment : equipmentList) {
            total++;
            if (null != equipment.createIterator()) {
                total += equipment.createIterator().size();
            }
        }
        return total;
    }
}
