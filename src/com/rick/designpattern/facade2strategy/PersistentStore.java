package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class PersistentStore extends MemoryObject {
    @Override
    public void buildCache(Address address) {
        MemoryObjectCache memoryObjectCache = new PagedMemoryObjectCache();
        memoryObjectCache.cache(address);
    }

    @Override
    public void remove(Address address){

    }

}
