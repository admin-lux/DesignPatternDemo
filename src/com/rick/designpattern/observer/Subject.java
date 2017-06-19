package com.rick.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/19.
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void Notify() {
        for (Observer os : observers) {
            os.update(this);
        }
    }
}
