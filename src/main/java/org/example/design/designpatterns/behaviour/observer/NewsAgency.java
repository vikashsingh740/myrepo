package org.example.design.designpatterns.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news = null;
    List<Channel> channels = new ArrayList<>();

    public void addChannel(Channel channel) {
        this.channels.add(channel);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public void publish() {
        for (Channel channel : channels) {
            channel.update(news);
        }
    }

}
