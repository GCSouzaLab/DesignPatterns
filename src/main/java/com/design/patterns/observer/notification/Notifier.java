package com.design.patterns.observer.notification;

import com.design.patterns.observer.receiver.Observer;

public interface Notifier {
    void notify(String message);

    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);
}
