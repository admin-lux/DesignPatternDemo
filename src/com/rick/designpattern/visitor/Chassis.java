package com.rick.designpattern.visitor;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Chassis extends Equipment {
    private List<Equipment> equipments = new ArrayList<Equipment>();

    public Chassis(String name) {
        super(name);
    }

    /**
     * 功率
     *
     * @return
     */
    public Watt power() {
        Watt watt = new Watt(0f);
        for (Equipment equipment : createIterator()) {
            watt.setPowerx(watt.getPowerx() + equipment.power().getPowerx());
        }
        return watt;
    }

    /**
     * 实际价格
     *
     * @return
     */
    public Currency netPrice() {
        Currency currency = new Currency(0f);
        for (Equipment equipment : createIterator()) {
            currency.setPrice(currency.getPrice() + equipment.netPrice().getPrice());
        }
        return currency;
    }

    /**
     * 折扣价格
     *
     * @return
     */
    public Currency discountPrice() {
        Currency currency = new Currency(0f);
        for (Equipment equipment : createIterator()) {
            currency.setPrice(currency.getPrice() + equipment.discountPrice().getPrice());
        }
        return currency;
    }

    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    public void remove(Equipment equipment) {
        equipments.remove(equipment);
    }

    public List<Equipment> createIterator() {
        return equipments;
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        for (Equipment equipment : equipments) {
            equipment.accept(visitor);
        }
        visitor.visitChassis(this);
    }
}
