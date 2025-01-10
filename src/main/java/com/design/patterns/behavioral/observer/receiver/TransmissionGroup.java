package com.design.patterns.behavioral.observer.receiver;

import java.util.ArrayList;
import java.util.List;

public class TransmissionGroup implements Observer {

    private final List<User> users = new ArrayList<>();

    public TransmissionGroup() {
    }

    public TransmissionGroup(List<User> users) {
        this.users.addAll(users);
    }

    @Override
    public void notify(String message) {
        users.forEach(user -> user.receiveMessage(message));
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
