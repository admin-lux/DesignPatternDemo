package com.rick.designpattern.bridge;

/**
 * Created by MyPC on 2017/6/26.
 */
public abstract class Window {
    private View _contents;
    private WindowImp _imp;

    public Window(View contents) {
        this._contents = contents;
    }

    public abstract void drawContents();

    public abstract void close();

    public abstract void iconify();

    public abstract void deiconify();

    public abstract void setOrigin(Point at);

    public abstract void setExtent(Point extent);

    public abstract void raise();

    public abstract void lower();

    public abstract void drawLing(Point at, Point extent);

    public abstract void drawRect(Point at, Point extent);

    public abstract void drawPolygon(Point[] at, int n);

    public abstract void drawText(String text, Point at);

    protected View getView() {
        return _contents;
    }

    protected WindowImp getWindowImp() {
        return _imp;
    }


}
