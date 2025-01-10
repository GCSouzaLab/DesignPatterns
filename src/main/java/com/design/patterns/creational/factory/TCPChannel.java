package com.design.patterns.creational.factory;

public class TCPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("TCP send");
    }
}
