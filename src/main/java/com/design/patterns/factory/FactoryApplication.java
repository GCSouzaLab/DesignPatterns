package com.design.patterns.factory;

public class FactoryApplication {
    public static void main(String[] args) {

        /**
         *  Building a TCP channel dinamically
         *  No responsibility is given to the user
         *  Principle open/closed -> We  don't need to reajust the factory, we can register a new channel
         */
        Channel channel = ChannelFactory.create(EChannel.TCP);
        channel.send();

        // Unknown channel
        try {
            channel = ChannelFactory.create(EChannel.HTTP);
            channel.send();
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
