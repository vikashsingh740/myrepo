package org.example.design.designpatterns.behaviour.observer;

public class Channel1 implements Channel {
    String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("=====>>> In Channel1====>>>>  "+news);
    }
}
