package org.example.design.designpatterns.behaviour.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User u1 = new UserImpl("vikash", chatMediator);
        User u2 = new UserImpl("Raju", chatMediator);
        User u3 = new UserImpl("Manoj", chatMediator);
        User u4 = new UserImpl("Darshan", chatMediator);

        chatMediator.addUser(u1);
        chatMediator.addUser(u2);
        chatMediator.addUser(u3);
        chatMediator.addUser(u4);

        u1.sendMessage("Hello everyone vikash here");
        u2.sendMessage("Hello everyone Raju here");
        u3.sendMessage("Hello everyone Manoj here");
        u4.sendMessage("Hello everyone Darshan here");
    }
}
