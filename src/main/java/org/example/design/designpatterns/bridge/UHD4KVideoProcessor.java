package org.example.design.designpatterns.bridge;

public class UHD4KVideoProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.println("process "+videoFile);
    }
}
