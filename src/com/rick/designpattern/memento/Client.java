package com.rick.designpattern.memento;

/**
 * Created by MyPC on 2017/6/14.
 */
public class Client {


    public static void main(String[] args) {
        WindowsSystem windowsSystem = new WindowsSystem();
        windowsSystem.setState("好的状态");
        Caretaker caretaker = new Caretaker();
        caretaker.saveMemento(windowsSystem.createMemento());

        System.out.println("当前系统状态1：" + windowsSystem.getState());
        windowsSystem.setState("坏的状态");
        System.out.println("当前系统状态2：" + windowsSystem.getState());
        windowsSystem.restoreMemento(caretaker.retrieveMemento());
        System.out.println("恢复后，当前系统状态：" + windowsSystem.getState());

    }
}
