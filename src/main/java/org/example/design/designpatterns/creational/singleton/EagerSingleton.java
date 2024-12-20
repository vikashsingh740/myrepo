package org.example.design.designpatterns.creational.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
