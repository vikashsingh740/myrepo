package org.example.design.designpatterns.command;

public class FileSaveCommand implements FileOperationCommand {

    TextFile textFile;

    public FileSaveCommand(TextFile textFile){
        this.textFile = textFile;
    }

    @Override
    public void execute() {
        textFile.save();
    }
}
