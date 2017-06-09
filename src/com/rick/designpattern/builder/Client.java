package com.rick.designpattern.builder;

/**
 * Created by MyPC on 2017/6/9.
 */
public class Client {

    public void buy(int type) {
        Builder builder = null;
        if (1 == type) {
            builder = new ConcreteBuilder1();
        } else if (2 == type) {
            builder = new ConcreteBuilder2();
        } else {
            builder = new ConcreteBuilder3();
        }
        DirectorCashier directorCashier = new DirectorCashier();
        directorCashier.buildFood(builder);
        builder.getProducts();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.buy(2);
        System.out.println("-------------");
        client.buy(1);
        System.out.println("-------------");
        client.buy(3);

    }

}
