package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public abstract class AbstractList<T> {

    public abstract Iterator<T> createIterator();
}
