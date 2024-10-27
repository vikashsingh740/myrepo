package org.example.design.designpatterns.bridge;

public class HDVideoProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.println("process "+videoFile);
    }
}
