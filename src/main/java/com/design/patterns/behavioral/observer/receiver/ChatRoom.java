package com.design.patterns.behavioral.observer.receiver;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Observer {
    private final String groupName;
    private final List<User> users = new ArrayList<>();

    public ChatRoom(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void notify(String message) {
        System.out.println("Message sent to group: " + groupName);
        users.forEach(user -> user.receiveMessage(message));
    }

    public void addUser(User user) {
        users.add(user);
    }
    public void removeUser(User user) {
        users.remove(user);
    }
}
