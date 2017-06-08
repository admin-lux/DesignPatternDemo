package com.rick.designpattern.abstract_factory;

/**
 * 用来创建AMD下系列产品
 * <p>
 * Created by MyPC on 2017/6/8.
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public CPU createCpu() {
        return new AmdCPU(30);
    }

    @Override
    public MainBoard creatMainBoard() {
        return new AmdMainBoard(30);
    }
}
