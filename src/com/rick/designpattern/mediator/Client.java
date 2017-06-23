package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public class Client {


    public static void main(String[] args) {

        FontDialogDirector fontDialogDirector = new FontDialogDirector();
        fontDialogDirector.createWidgets();
        fontDialogDirector.showDialog();

        fontDialogDirector.widgetChanged(fontDialogDirector.get_ok());
        fontDialogDirector.widgetChanged(fontDialogDirector.get_cancel());
        fontDialogDirector.widgetChanged(fontDialogDirector.getListBox());
    }
}
