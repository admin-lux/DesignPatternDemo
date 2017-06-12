package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public abstract class EquipmentVisitor {
    public EquipmentVisitor() {
    }

    abstract void visitFloppyDisk(FloppyDisk floppyDisk);

    abstract void visitCard(Card card);

    abstract void visitChassis(Chassis chassis);

    abstract void visitBus(Bus bus);

    abstract void visitCabinet(Cabinet cabinet);
}
