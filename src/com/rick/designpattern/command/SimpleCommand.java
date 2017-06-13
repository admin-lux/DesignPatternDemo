package com.rick.designpattern.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by MyPC on 2017/6/13.
 */
public class SimpleCommand<T> extends Command {
    private T t;
    private Method method;

    public SimpleCommand(T t, Method method) {
        this.t = t;
        this.method = method;
    }

    @Override
    public void execute() throws InvocationTargetException, IllegalAccessException {
        method.invoke(t, null);
    }
}
