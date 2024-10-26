package org.example.design.designpatterns.command;

public class Client1 {
    public static void main(String[] args) {
       FileOperationCommand fileOpenCommand = new FileOpenCommand(new TextFile());
       Invoker invoker = new Invoker(fileOpenCommand);
       invoker.invoke();

        FileOperationCommand fileSaveCommand = new FileSaveCommand(new TextFile());
        Invoker invoker1 = new Invoker(fileSaveCommand);
        invoker1.invoke();
    }
}
