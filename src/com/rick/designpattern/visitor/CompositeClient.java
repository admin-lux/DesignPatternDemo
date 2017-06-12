package com.rick.designpattern.visitor;

/**
 * Created by MyPC on 2017/6/12.
 */
public class CompositeClient {


    public static void main(String[] args) {
        Cabinet cabinet = new Cabinet("PC Cabinet");
        Chassis chassis = new Chassis("PC Chassis");

        cabinet.add(chassis);

        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring"));

        chassis.add(bus);
        chassis.add(new FloppyDisk("3.5in Floppy"));


        System.out.println("The net price is " + chassis.netPrice().getPrice());
    }
}
