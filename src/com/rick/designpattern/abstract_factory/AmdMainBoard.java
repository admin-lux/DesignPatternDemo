package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public class AmdMainBoard implements MainBoard {
    private int cpuHoles;

    public AmdMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("AMD主板上的CPU插槽孔数：" + cpuHoles);
    }
}