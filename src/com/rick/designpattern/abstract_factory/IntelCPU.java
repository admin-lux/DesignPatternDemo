package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public class IntelCPU implements CPU {
    private int pins;   //表示CPU的脚针数

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU的脚针数目："+pins);
    }
}
