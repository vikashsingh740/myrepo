package org.example.design.designpatterns.behaviour.mediator;

public interface ChatMediator {

    void sendMessage(String msg, User user);
    void addUser(User user);
}
