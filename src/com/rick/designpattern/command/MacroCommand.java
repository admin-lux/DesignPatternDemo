package com.rick.designpattern.command;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MyPC on 2017/6/13.
 */
public class MacroCommand extends Command {
    List<Command> commands = new ArrayList<Command>();

    public void add(Command command) {
        commands.add(command);
    }

    public void remove(Command command) {
        commands.remove(command);
    }

    @Override
    public void execute() throws InvocationTargetException, IllegalAccessException {
        for (Command command : commands) {
            command.execute();
        }
    }
}
