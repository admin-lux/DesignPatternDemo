package com.rick.designpattern.builder;

/**
 * Created by MyPC on 2017/6/9.
 */
public class ConcreteBuilder3 extends Builder {
    private Product product = null;

    public ConcreteBuilder3() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.add("Hamburger", "3");
    }

    @Override
    public void getProducts() {
        product.getProducts();
    }
}
