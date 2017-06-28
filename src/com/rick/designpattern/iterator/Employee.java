package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
