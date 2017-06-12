package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Cabinet extends Chassis {
    public Cabinet(String name) {
        super(name);
    }

    @Override
    public Watt power() {
        return new Watt(70f);
    }

    @Override
    public Currency netPrice() {
        return new Currency(150f);
    }

    @Override
    public Currency discountPrice() {
        return new Currency(139f);
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitCabinet(this);
    }
}
