package com.rick.designpattern.adapter;

/**
 * Created by MyPC on 2017/6/29.
 */
public class Client {


    public static void main(String[] args) {
        ServerOne one = new ServerOne();
        System.out.println(one.getServerName() + "=" + one.getPlayerCount());
        ServerTwo two = new ServerTwo();
        System.out.println(two.getServerName() + "=" + two.getPlayerCount());
        ServerThree three = new ServerThree();
        System.out.println(three.getServerName() + "=" + three.getPlayerCount());
    }
}
