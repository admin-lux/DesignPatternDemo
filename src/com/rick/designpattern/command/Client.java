package com.rick.designpattern.command;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by MyPC on 2017/6/13.
 */
public class Client {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MyClass receiver = new MyClass();

        Command command = new SimpleCommand<MyClass>(receiver, receiver.getClass().getMethod("handler", null));
        command.execute();

        Document document = new Document("TEST.txt");
        Application application = new Application();

        OpenCommand openCommand = new OpenCommand(application);
        openCommand.execute();

        PasteCommand pasteCommand = new PasteCommand(document);
        pasteCommand.execute();

        MacroCommand macroCommand = new MacroCommand();
        macroCommand.add(command);
        macroCommand.add(openCommand);
        macroCommand.add(pasteCommand);
        macroCommand.execute();

    }
}
