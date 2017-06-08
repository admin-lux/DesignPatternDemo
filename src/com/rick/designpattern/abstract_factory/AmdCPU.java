package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public class AmdCPU implements CPU {
    private int pins;

    public AmdCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("CMD CPU的脚针数目：" + pins);
    }
}
