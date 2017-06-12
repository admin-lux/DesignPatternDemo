package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class PricingVisitor extends EquipmentVisitor {
    private float total;

    public PricingVisitor() {
    }

    public float getTotal() {
        return total;
    }

    @Override
    void visitFloppyDisk(FloppyDisk floppyDisk) {
        total += floppyDisk.netPrice().getPrice();
    }

    @Override
    void visitCard(Card card) {

    }

    @Override
    void visitChassis(Chassis chassis) {
        total += chassis.netPrice().getPrice();
    }

    @Override
    void visitBus(Bus bus) {

    }

    @Override
    void visitCabinet(Cabinet cabinet) {

    }
}
