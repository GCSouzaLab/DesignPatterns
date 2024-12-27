package com.design.patterns.factory;

public class UDPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("UDP send");
    }
}
