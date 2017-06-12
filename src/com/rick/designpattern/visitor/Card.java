package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class Card extends Chassis {
    public Card(String name) {
        super(name);
    }

    @Override
    public Watt power() {
        return new Watt(70f);
    }

    @Override
    public Currency netPrice() {
        return new Currency(70f);
    }

    @Override
    public Currency discountPrice() {
        return new Currency(59f);
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitCard(this);
    }
}
