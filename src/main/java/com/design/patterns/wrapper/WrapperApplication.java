package com.design.patterns.wrapper;

public class WrapperApplication {
    public static void main(String[] args) {

        PortugueseMessage portugueseMessage = new PortugueseMessage();
        ChatSystem adapter = new PortugueseToEnglishMessageAdapter(portugueseMessage);

        adapter.receiveMessageInEnglish("Hello, how are you?");
    }
}