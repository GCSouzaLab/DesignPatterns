package com.design.patterns.Factory;

public class TCPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("TCP send");
    }
}
