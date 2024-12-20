package org.example.design.designpatterns.creational.factory;

public abstract class OperationSystem {
    private String version;
    private String architecture;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public OperationSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public abstract void changeDir(String dir);

    public abstract void removeDir(String dir);

}
