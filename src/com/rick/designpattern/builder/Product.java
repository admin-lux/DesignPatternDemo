package com.rick.designpattern.builder;

import java.util.*;

/**
 * Created by MyPC on 2017/6/9.
 */
public class Product {
    private Map<String, String> products = new HashMap<String, String>();

    /**
     * 添加具体产品
     */
    public void add(String name, String value) {
        products.put(name, value);
    }

    public void getProducts() {
        Set<String> keys = products.keySet();
        for (String key : keys) {
            System.out.println(key + "=" + products.get(key));
        }
    }


}
