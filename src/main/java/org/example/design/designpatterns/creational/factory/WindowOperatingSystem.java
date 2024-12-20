package org.example.design.designpatterns.creational.factory;

public class WindowOperatingSystem extends OperationSystem {

    public WindowOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
