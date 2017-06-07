package com.rick.designpattern.flyweight;

import java.util.Hashtable;

/**
 * Created by MyPC on 2017/6/7.
 */
public class FlyweightFactory {

    //Flyweight pool
    private Hashtable flyweights = new Hashtable();

    public Flyweight getFlyweight(Object key) {
        Flyweight flyweight = (Flyweight) flyweights.get(key);
        if (null == flyweight) {
            flyweight = new ConcreteFlyweight();
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
