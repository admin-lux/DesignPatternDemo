package com.rick.designpattern.visitor;

import java.util.List;

/**
 * 设备信息
 * <p>
 * Created by MyPC on 2017/6/12.
 */
public abstract class Equipment {
    private String name;

    public Equipment(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    /**
     * 功率
     *
     * @return
     */
    public Watt power() {
        return new Watt(0f);
    }

    /**
     * 实际价格
     *
     * @return
     */
    public Currency netPrice() {
        return new Currency(0f);
    }


    /**
     * 折扣价格
     *
     * @return
     */
    public Currency discountPrice() {
        return new Currency(0f);
    }


    public void add(Equipment equipment) {

    }

    public void remove(Equipment equipment) {

    }

    public List<Equipment> createIterator() {
        return null;
    }

    public abstract void accept(EquipmentVisitor visitor);


}
