package org.example.design.designpatterns.behaviour.mediator;

public abstract class User {

    String name;
    protected ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessage(String name);
    public abstract void receiveMessage(String name);
}
