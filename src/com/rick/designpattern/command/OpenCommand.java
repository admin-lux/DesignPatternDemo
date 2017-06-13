package com.rick.designpattern.command;

/**
 * Created by MyPC on 2017/6/13.
 */
public class OpenCommand extends Command {
    private Application application;

    public OpenCommand(Application application) {
        this.application = application;
    }

    @Override
    public void execute() {
        String name = AskUser.getName();
        if (null != name) {
            Document document = new Document(name);
            application.add(document);
            document.open();
        }
    }
}
