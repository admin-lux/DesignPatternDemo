package com.rick.designpattern.memento;

/**
 * Created by MyPC on 2017/6/14.
 */
public class Caretaker {
    private Memento memento;

    /**
     * 获取备份
     *
     * @return
     */
    public Memento retrieveMemento() {
        return memento;
    }

    /**
     * 设置备份
     *
     * @param memento
     */
    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
