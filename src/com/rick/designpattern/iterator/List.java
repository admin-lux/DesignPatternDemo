package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class List<T> extends AbstractList {
    private T[] _ts;
    private long _size = Integer.MAX_VALUE;

    public List(long size) {
        this._size = size;
    }

    public List(List<T> list) {
        _ts = list._ts;
        _size = list._size;
    }

    public List() {
    }

    public long count() {
        return _ts.length;
    }

    public T get(int current) {
        if (_ts.length > current) {
            return _ts[current];
        }
        return null;
    }

    public void add(T[] ts) {
        _ts = ts;
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(this);
    }
}
