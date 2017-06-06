package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class File extends PersistentStore  {

    @Override
    public void buildCache(Address address) {
        super.buildCache(address);
    }

    @Override
    public void remove(Address address) {

    }
}
