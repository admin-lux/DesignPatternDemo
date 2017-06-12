package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class FloppyDisk extends Equipment {

    public FloppyDisk(String name) {
        super(name);
    }

    @Override
    public Watt power() {
        return new Watt(100);
    }

    @Override
    public Currency netPrice() {
        return new Currency(156f);
    }

    @Override
    public Currency discountPrice() {
        return new Currency(150f);
    }

    @Override
    public void accept(EquipmentVisitor visitor) {
        visitor.visitFloppyDisk(this);
    }
}
