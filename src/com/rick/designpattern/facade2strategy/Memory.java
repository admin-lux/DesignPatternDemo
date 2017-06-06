package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class Memory {
    private Address address;

    public Memory(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
