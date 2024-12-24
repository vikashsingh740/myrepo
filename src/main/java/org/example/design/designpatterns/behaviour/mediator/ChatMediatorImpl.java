package org.example.design.designpatterns.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

    List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String msg, User user) {
        System.out.println(user+" sends the message");
        for (User u1 : users) {
            if (user != u1) {
                u1.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
