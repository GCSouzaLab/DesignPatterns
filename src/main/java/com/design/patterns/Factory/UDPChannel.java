package com.design.patterns.Factory;

public class UDPChannel implements Channel {
    @Override
    public void send() {
        System.out.println("UDP send");
    }
}
