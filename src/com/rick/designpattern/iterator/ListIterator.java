package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class ListIterator<T> extends Iterator {
    private List<T> _list;
    private long _current;

    ListIterator(List<T> list) {
        _list = list;
        _current = 0;
    }

    @Override
    void first() {
        _current = 0;
    }

    @Override
    void next() {
        _current++;
    }

    @Override
    boolean isDone() {
        return _current >= _list.count();
    }

    @Override
    T currentItem() {
        if (isDone()) {
            throw new NullPointerException("iterator is stop ");
        }
        return _list.get((int) _current);
    }
}
