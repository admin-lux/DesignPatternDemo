package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Bus extends Chassis {
    public Bus(String name) {
        super(name);
    }

    @Override
    public Watt power() {
        return new Watt(50f);
    }

    @Override
    public Currency netPrice() {
        return new Currency(80f);
    }

    @Override
    public Currency discountPrice() {
        return new Currency(69f);
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitBus(this);
    }
}
