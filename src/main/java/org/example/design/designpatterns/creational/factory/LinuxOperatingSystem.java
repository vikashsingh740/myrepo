package org.example.design.designpatterns.creational.factory;

public class LinuxOperatingSystem extends OperationSystem {

    public LinuxOperatingSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
