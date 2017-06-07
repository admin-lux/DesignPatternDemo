package com.rick.designpattern.flyweight3;

import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

/**
 * Created by MyPC on 2017/6/7.
 */
public class FlyweightFactory {
    private Hashtable<Object, ConcreteFlyweight> flyweights = new Hashtable<Object, ConcreteFlyweight>();


    public Flyweight getFlyweight(Object state) {
        if (state instanceof String[]) {
            UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
            String[] list = (String[]) state;
            for (Object obj : list) {
                unsharedConcreteFlyweight.add(getFlyweight(obj));
            }
            return unsharedConcreteFlyweight;
        } else if (state instanceof String) {
            ConcreteFlyweight concreteFlyweight = flyweights.get(state);
            if (null == concreteFlyweight) {
                concreteFlyweight = new ConcreteFlyweight(state);
                flyweights.put(state, concreteFlyweight);
            }
            return concreteFlyweight;
        } else {
            return null;
        }
    }

}
