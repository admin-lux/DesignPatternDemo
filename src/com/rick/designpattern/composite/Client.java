package com.rick.designpattern.composite;

/**
 * Created by MyPC on 2017/5/27.
 */
public class Client {


    public static void main(String[] args){

        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Leaf leaf4 = new Leaf();

        Leaf leaf5 = new Leaf();
        Leaf leaf6 = new Leaf();
        Leaf leaf7 = new Leaf();
        Leaf leaf8 = new Leaf();

        composite1.add(leaf1);
        composite1.add(leaf2);
        composite1.add(leaf3);
        composite1.add(leaf4);

        composite2.add(leaf5);
        composite2.add(leaf6);
        composite2.add(leaf7);
        composite2.add(leaf8);

        Composite allComposite = new Composite();
        allComposite.add(composite1);
        allComposite.add(composite2);
        allComposite.operation();

    }
}
