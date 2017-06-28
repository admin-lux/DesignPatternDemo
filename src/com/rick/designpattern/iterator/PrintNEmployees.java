package com.rick.designpattern.iterator;

/**
 * Created by MyPC on 2017/6/28.
 */
public class PrintNEmployees extends ListTraverser<Employee> {
    private int _total, _count;

    public PrintNEmployees(List<Employee> _list, int n) {
        super(_list);
        _total = n;
        _count = 0;
    }

    @Override
    protected boolean processItem(Employee employee) {
        _count++;
        System.out.println(employee.toString());
        return _count < _total;
    }
}
