package com.rick.designpattern.facade;

/**
 * Created by MyPC on 2017/6/5.
 */
public class Client {


    public static void main(String[] args) {
        ConcreteFacade concreteFacade = new ConcreteFacade();

        concreteFacade.on();
        System.out.println("-----------------------------------------------");
        concreteFacade.off();

        System.out.println("-----------------------------------------------");
        ConcreteFacade2 concreteFacade2 = new ConcreteFacade2();
        concreteFacade2.on();
        System.out.println("-----------------------------------------------");
        concreteFacade2.off();
    }


}
