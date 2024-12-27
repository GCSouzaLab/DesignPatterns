package com.design.patterns.factory;

public class TCPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("TCP send");
    }
}
