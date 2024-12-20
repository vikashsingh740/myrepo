package org.example.design.designpatterns.creational.factory;

public class OperatingSystemFactory {

    private OperatingSystemFactory(){}

    public static OperationSystem getInstance(String type, String version, String architecture) {
        if ("WINDOW".equals(type)) {
            return new WindowOperatingSystem(version, architecture);
        } else if ("LINUX".equals(type)) {
            return new LinuxOperatingSystem(version, architecture);
        } else {
            throw new IllegalArgumentException("OS Not supported");
        }
    }
}
