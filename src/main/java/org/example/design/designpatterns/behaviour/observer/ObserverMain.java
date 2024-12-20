package org.example.design.designpatterns.behaviour.observer;

public class ObserverMain {

    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        newsAgency.addChannel(new Channel1());
        newsAgency.addChannel(new Channel2());

        newsAgency.setNews("Hello");
        newsAgency.publish();
    }
}
