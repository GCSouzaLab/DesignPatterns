package com.design.patterns.behavioral.observer;

import com.design.patterns.behavioral.observer.notification.NotifyService;
import com.design.patterns.behavioral.observer.receiver.ChatRoom;
import com.design.patterns.behavioral.observer.receiver.PrivateChat;
import com.design.patterns.behavioral.observer.receiver.TransmissionGroup;
import com.design.patterns.behavioral.observer.receiver.User;

import java.util.List;

public class ObserverApplication {
    public static void main(String[] args) {
        NotifyService service = new NotifyService();

        ChatRoom chat = new ChatRoom("Chat Room 1");
        chat.addUser(new User("User 1"));
        service.addSubscriber(chat);

        PrivateChat privateChat = new PrivateChat(new User("User 2"), new User("User 3"));
        service.addSubscriber(privateChat);

        TransmissionGroup group = new TransmissionGroup(List.of(new User("User 4")));
        group.addUser(new User("User 5"));
        service.addSubscriber(group);

        service.notify("Hi, I'm selling honey, it's on sale today!!!");
    }
}
