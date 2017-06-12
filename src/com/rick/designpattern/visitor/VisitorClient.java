package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class VisitorClient {


    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("PC Cabinet");
        Chassis chassis = new Chassis("PC Chassis");

        cabinet.add(chassis);

        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring"));

        chassis.add(bus);
        chassis.add(new FloppyDisk("3.5in Floppy"));

        PricingVisitor pricingVisitor = new PricingVisitor();
        chassis.accept(pricingVisitor);
        System.out.println(chassis.name() + " in price is " + pricingVisitor.getTotal());

        InventoryVisitor inventoryVisitor = new InventoryVisitor();
        chassis.accept(inventoryVisitor);
        System.out.println("Inventory " + chassis.name() + " " + inventoryVisitor.getInventory().getAccumulate());
    }
}
