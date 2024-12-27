package com.design.patterns.observer.receiver;

public class PrivateChat implements Observer {
    private final User originUser;
    private final User destinationUser;

    public PrivateChat(User originUser, User destinationUser) {
        this.originUser = originUser;
        this.destinationUser = destinationUser;
    }

    @Override
    public void notify(String message) {
        System.out.println("Message from " + originUser.getName() + " sent to: " + destinationUser.getName());
    }
}
