package com.rick.designpattern.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by MyPC on 2017/5/27.
 */
public class Composite extends Component {
    List<Component> childs = new ArrayList<Component>();

    @Override
    public void operation() {
        for (Component child : childs) {
            child.operation();
        }
    }

    @Override
    public void add(Component component) {
        childs.add(component);
    }

    @Override
    public void remove(Component component) {
        childs.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return childs.get(index);
    }
}
