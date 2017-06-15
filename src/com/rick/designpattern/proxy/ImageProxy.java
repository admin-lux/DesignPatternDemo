package com.rick.designpattern.proxy;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by MyPC on 2017/6/15.
 */
public class ImageProxy extends Graphic {
    private String fileName;
    private Image image;
    private Point point;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
        point = new Point(15, 0x000000);
        image = null;
    }

    public ImageProxy() {
    }

    @Override
    public void draw(Point point) {
        getImage().draw(point);
    }

    @Override
    public void handleMouse(Event event) {
        getImage().handleMouse(event);
    }

    @Override
    public Point getExtent() {
        if (null != point) {
            point = getImage().getExtent();
        }
        return point;
    }

    @Override
    public void load(InputStream inputStream) {
        getImage().load(inputStream);
    }

    @Override
    public void save(OutputStream outputStream) {
        getImage().save(outputStream);
    }

    public Image getImage() {
        if (null == image) {
            image = new Image(fileName);
        }
        return image;
    }
}
