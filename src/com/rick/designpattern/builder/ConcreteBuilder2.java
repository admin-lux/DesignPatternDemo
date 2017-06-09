package com.rick.designpattern.builder;

/**
 * 具体建造者类:餐馆员工，汉堡1个+饮料2个
 * <p>
 * Created by MyPC on 2017/6/9.
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = null;

    public ConcreteBuilder2() {
        this.product = new Product();
    }
    
    @Override
    public void buildPart1() {
        product.add("Hamburger", "1");
    }

    @Override
    public void buildPart2() {
        product.add("Drink", "2");
    }

    @Override
    public void getProducts() {
        product.getProducts();
    }
}
