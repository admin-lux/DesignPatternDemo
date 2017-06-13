package com.rick.designpattern.command;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by MyPC on 2017/6/13.
 */
public abstract class Command {

    public Command() {
    }

    public abstract void execute() throws InvocationTargetException, IllegalAccessException;
}
