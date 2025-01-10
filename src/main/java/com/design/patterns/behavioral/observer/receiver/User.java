package com.design.patterns.behavioral.observer.receiver;

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
