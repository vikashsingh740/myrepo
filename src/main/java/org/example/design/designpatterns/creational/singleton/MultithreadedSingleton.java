package org.example.design.designpatterns.creational.singleton;

import java.io.Serializable;

public class MultithreadedSingleton implements Serializable {

    private static MultithreadedSingleton instance;

    private MultithreadedSingleton() {
    }

    public static MultithreadedSingleton getInstance() {
        if (instance == null) {
            synchronized (MultithreadedSingleton.class) {
                if (instance == null) {
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }

}
