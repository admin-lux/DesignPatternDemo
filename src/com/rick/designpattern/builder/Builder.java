package com.rick.designpattern.builder;

/**
 * Created by MyPC on 2017/6/9.
 */
public abstract class Builder {

    /**
     * 创建产品的第一部分
     */
    public void buildPart1(){

    }

    /**
     * 创建产品的第二部分
     */
    public void buildPart2(){

    }

    /**
     * 返回产品
     */
    public abstract void getProducts();

}
