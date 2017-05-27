package com.rick.designpattern.composite;

/**
 * Created by MyPC on 2017/5/27.
 */
public class Leaf extends Component {

    @Override
    public void operation() {
        System.out.println("leaf");
    }
}
