package com.rick.designpattern.mediator;

/**
 * Created by MyPC on 2017/6/23.
 */
public class FontDialogDirector extends DialogDirector {
    private Button _ok, _cancel;
    private ListBox listBox;
    private EntryField entryField;

    @Override
    public void createWidgets() {
        _ok = new Button(this);
        _cancel = new Button(this);
        listBox = new ListBox(this);
        entryField = new EntryField(this);
    }

    @Override
    public void showDialog() {
        System.out.println("显示对话框");
    }

    @Override
    public void widgetChanged(Widget theChangedWidget) {
        if (theChangedWidget == listBox) {
            entryField.setText(listBox.getSelection());
        } else if (theChangedWidget == _ok) {
            System.out.println("提交");
        } else if (theChangedWidget == _cancel) {
            System.out.println("取消对话框");
        }
    }

    public Button get_ok() {
        return _ok;
    }

    public void set_ok(Button _ok) {
        this._ok = _ok;
    }

    public Button get_cancel() {
        return _cancel;
    }

    public void set_cancel(Button _cancel) {
        this._cancel = _cancel;
    }

    public ListBox getListBox() {
        return listBox;
    }

    public void setListBox(ListBox listBox) {
        this.listBox = listBox;
    }

    public EntryField getEntryField() {
        return entryField;
    }

    public void setEntryField(EntryField entryField) {
        this.entryField = entryField;
    }
}
