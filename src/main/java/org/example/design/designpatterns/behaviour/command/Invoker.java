package org.example.design.designpatterns.behaviour.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    List<FileOperationCommand> fileOperationCommands = new ArrayList<>();
    FileOperationCommand fileOperationCommand;

    public Invoker(FileOperationCommand fileOperationCommand) {
        this.fileOperationCommand = fileOperationCommand;
        fileOperationCommands.add(fileOperationCommand);
    }

    public void invoke() {
        fileOperationCommand.execute();
    }
}
