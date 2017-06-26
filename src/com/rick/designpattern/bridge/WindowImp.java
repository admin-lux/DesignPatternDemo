package com.rick.designpattern.bridge;

/**
 * Created by MyPC on 2017/6/26.
 */
public interface WindowImp {

    public void impTom();

    public void impBottom();

    public void impSetExtent(Point point);

    public void impSetOrigin(Point point);

    public void deviceRect(Coord coord, Coord coord2, Coord coord3, Coord coord4);

    public void deviceText(String text, Coord coord, Coord coord2);

    public void deviceBitmap(String text, Coord coord, Coord coord2);

}
