package com.design.patterns.behavioral.observer.notification;

import com.design.patterns.behavioral.observer.receiver.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotifyService implements Notifier {
    private final List<Observer> observers = new ArrayList<>();


    @Override
    public void notify(String message) {
        observers.forEach(observer -> observer.notify(message));
    }

    @Override
    public void addSubscriber(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        observers.remove(observer);
    }
}
