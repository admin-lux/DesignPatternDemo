package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class ReverseListIterator<T> extends Iterator {
    private List<T> _list;
    private long _current;

    ReverseListIterator(List<T> list) {
        _list = list;
        _current = _list.count() - 1;
    }

    @Override
    void first() {
        _current = _list.count() - 1;
    }

    @Override
    void next() {
        _current--;
    }

    @Override
    boolean isDone() {
        return _current < 0;
    }

    @Override
    Object currentItem() {
        if (isDone()) {
            return new NullPointerException("iterator is stop");
        }
        return _list.get((int) _current);
    }
}
