package com.rick.designpattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by MyPC on 2017/6/30.
 */
public class Context {
    private final Map<String, Integer> valueMap = new HashMap<String, Integer>();

    public void addValue(final String key, final int value) {
        valueMap.put(key, Integer.valueOf(value));
    }

    public int getValue(final String key) {
        return valueMap.get(key).intValue();
    }

}
