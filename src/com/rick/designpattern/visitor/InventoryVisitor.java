package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class InventoryVisitor extends EquipmentVisitor {
    private Inventory inventory = new Inventory();

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    void visitFloppyDisk(FloppyDisk floppyDisk) {
        inventory.accumulate(floppyDisk);
    }

    @Override
    void visitCard(Card card) {

    }

    @Override
    void visitChassis(Chassis chassis) {
        inventory.accumulate(chassis);
    }

    @Override
    void visitBus(Bus bus) {

    }

    @Override
    void visitCabinet(Cabinet cabinet) {

    }
}
