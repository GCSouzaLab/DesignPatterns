package com.design.patterns.behavioral.observer.notification;

import com.design.patterns.behavioral.observer.receiver.Observer;

public interface Notifier {
    void notify(String message);

    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);
}
