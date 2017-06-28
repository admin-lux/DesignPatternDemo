package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public abstract class Iterator<T> {

    abstract void first();

    abstract void next();

    abstract boolean isDone();

    abstract T currentItem();

}
