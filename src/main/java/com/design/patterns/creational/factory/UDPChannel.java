package com.design.patterns.creational.factory;

public class UDPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("UDP send");
    }
}
