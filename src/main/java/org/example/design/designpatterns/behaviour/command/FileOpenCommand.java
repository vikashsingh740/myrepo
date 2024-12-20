package org.example.design.designpatterns.behaviour.command;

public class FileOpenCommand implements FileOperationCommand {

    TextFile textFile;

    public FileOpenCommand(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.open();
    }
}
