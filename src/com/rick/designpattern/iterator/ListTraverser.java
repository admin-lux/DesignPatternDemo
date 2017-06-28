package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public abstract class ListTraverser<T> {
    private ListIterator<T> _listIterator;

    public ListTraverser(List<T> _list) {
        this._listIterator = new ListIterator<T>(_list);
    }

    public boolean traverser() {
        boolean result = false;
        for (_listIterator.first(); !_listIterator.isDone(); _listIterator.next()) {
            result = processItem(_listIterator.currentItem());
            if (result == false) {
                break;
            }
        }
        return result;
    }

    protected abstract boolean processItem(T t);


}
