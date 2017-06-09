package com.rick.designpattern.builder;

/**
 * 具体建造者类:餐馆员工,返回的套餐是：汉堡两个+饮料一个
 * <p>
 * Created by MyPC on 2017/6/9.
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = null;

    public ConcreteBuilder1() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.add("Hamburger", "2");
    }

    @Override
    public void buildPart2() {
        product.add("Drink", "1");
    }

    @Override
    public void getProducts() {
        product.getProducts();
    }
}
