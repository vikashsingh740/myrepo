package org.example.design.designpatterns.command;

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
