package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public abstract class MemoryObject {

    public abstract void buildCache(Address address);

    public abstract void remove(Address address);
}
