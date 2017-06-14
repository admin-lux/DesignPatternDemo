package com.rick.designpattern.memento;

/**
 * Created by MyPC on 2017/6/14.
 */
public class WindowsSystem {
    /**
     * 系统状态
     */
    private String state;

    /**
     * 创建系统备份
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 回复系统备份
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    /**
     * 当前系统状态
     *
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * 设置系统状态
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }
}
