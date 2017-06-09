package com.rick.designpattern.builder;

/**
 * 指导者:收银员
 * <p>
 * Created by MyPC on 2017/6/9.
 */
public class DirectorCashier {

    /**
     * 收银餐馆员工返回的食物
     */
    public void buildFood(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}
