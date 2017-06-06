package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class Domain {
    private AddressTranslation mAddressTranslation;
    private MemoryObject mMemoryObject;
    private MemoryObjectCache mMemoryObjectCache;

    public Domain() {
        this.mAddressTranslation = new TwoLevelPageTable();
        this.mMemoryObject = new PersistentStore();
        this.mMemoryObjectCache = new PagedMemoryObjectCache();
    }

    public void add(Memory memory, Address address) {
        mAddressTranslation.findMemory(address);
        mMemoryObject.buildCache(address);
    }

    public void remove(Memory memory) {
        mAddressTranslation.findMemory(memory.getAddress());
        mMemoryObject.remove(memory.getAddress());
    }

    public void protect(Memory memory, Protection protection) {

    }

    public void RepairFault() {

    }
}
