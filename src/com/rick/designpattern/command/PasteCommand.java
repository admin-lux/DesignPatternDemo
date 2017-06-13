package com.rick.designpattern.command;

/**
 * Created by MyPC on 2017/6/13.
 */
public class PasteCommand extends Command {
    private Document document;

    public PasteCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.paste();
    }
}
