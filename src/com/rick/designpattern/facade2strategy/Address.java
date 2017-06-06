package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class Address {
    private byte mByte = 0x00010;

    public Address(byte mByte) {
        this.mByte = mByte;
    }

    public byte getmByte() {

        return mByte;
    }

    public void setmByte(byte mByte) {
        this.mByte = mByte;
    }
}
