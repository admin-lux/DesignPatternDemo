package com.rick.designpattern.abstract_factory;

/**
 * 用来创建与Intel相关的所有产品
 * <p>
 * Created by MyPC on 2017/6/8.
 */
public class IntelFactory implements AbstractFactory {
    @Override
    public CPU createCpu() {
        return new IntelCPU(24);
    }

    @Override
    public MainBoard creatMainBoard() {
        return new IntelMainBoard(24);
    }
}
