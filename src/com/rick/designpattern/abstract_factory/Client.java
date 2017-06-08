package com.rick.designpattern.abstract_factory;

/**
 * Created by MyPC on 2017/6/8.
 */
public class Client {

    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory intelFactory = new IntelFactory();  //客户选定某类具体工厂,工厂负责成产匹配的组件
        computerEngineer.makeComputer(intelFactory);        //工程师开始组装
    }
}
