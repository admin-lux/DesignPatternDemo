package com.rick.designpattern.facade2strategy;

/**
 * Created by MyPC on 2017/6/6.
 */
public class TwoLevelPageTable extends AddressTranslation {
    @Override
    public Memory findMemory(Address address) {
        return new Memory(address);
    }
}
