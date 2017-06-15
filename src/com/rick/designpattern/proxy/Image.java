package com.rick.designpattern.proxy;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by MyPC on 2017/6/15.
 */
public class Image extends Graphic {
    private String fileName;
    private Point point;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    public Image() {
    }

    @Override
    public void draw(Point point) {
        this.point = point;
        System.out.println("字体大小：" + point.getTextSize() + "sp；字体颜色：" + point.getTextColor());
    }

    @Override
    public void handleMouse(Event event) {
        super.handleMouse(event);
    }

    @Override
    public Point getExtent() {
        return point;
    }

    @Override
    public void load(InputStream inputStream) {
        System.out.println("Class Image is method load");
    }

    @Override
    public void save(OutputStream outputStream) {
        System.out.println("Class Image is method save");
    }
}
