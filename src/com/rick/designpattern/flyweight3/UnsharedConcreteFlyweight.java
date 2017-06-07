package com.rick.designpattern.flyweight3;

import com.rick.designpattern.facade.ConcreteFacade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/7.
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private List<Flyweight> flyweights;

    public UnsharedConcreteFlyweight() {
        this.flyweights = new ArrayList<Flyweight>();
    }

    @Override
    public void operation(Object state) {
        for (Flyweight concreteFlyweight : flyweights) {
            concreteFlyweight.operation(state);
        }
    }

    public void add(Flyweight concreteFlyweight) {
        flyweights.add(concreteFlyweight);
    }
}
