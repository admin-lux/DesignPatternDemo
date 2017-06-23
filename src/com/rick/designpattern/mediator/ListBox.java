package com.rick.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/23.
 */
public class ListBox extends Widget {
    private List<String> listItems;

    private int position;

    public ListBox(DialogDirector dialogDirector) {
        super(dialogDirector);
        listItems = new ArrayList<String>();
        listItems.add("1");
        listItems.add("2");
        listItems.add("3");
        listItems.add("4");
        listItems.add("5");
    }

    public String getSelection() {
        if (null == listItems || listItems.size() <= 0) {
            return "";
        } else {
            return listItems.get(position);
        }
    }

    public void setList(List<String> listItems) {
        this.listItems = listItems;
    }

    @Override
    public void handleMouse(MouseEvent mouseEvent) {
        position = mouseEvent.getY();
    }
}
