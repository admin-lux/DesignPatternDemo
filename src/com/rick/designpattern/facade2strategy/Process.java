package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class Process {


    public static void main(String[] args) {
        Domain domain = new Domain();
        Address address = new Address((byte) 0x0001);
        Memory memory = new Memory(address);
        domain.add(memory, address);
        domain.remove(memory);
    }
}
