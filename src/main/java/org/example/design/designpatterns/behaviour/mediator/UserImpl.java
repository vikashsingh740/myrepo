package org.example.design.designpatterns.behaviour.mediator;

public class UserImpl extends User {

    public UserImpl(String name, ChatMediator chatMediator) {
        super(name, chatMediator);
    }

    @Override
    public void sendMessage(String msg) {
        chatMediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name+" receives the message : "+msg);
    }
}
