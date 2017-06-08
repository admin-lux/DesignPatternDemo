package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public interface AbstractFactory {

    /**
     * 创建Cpu对象
     *
     * @return Cpu对象
     */
    public CPU createCpu();

    /**
     * 创建MainBoard对象
     *
     * @return MainBoard对象
     */
    public MainBoard creatMainBoard();
}
