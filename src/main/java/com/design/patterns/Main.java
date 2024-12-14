package com.design.patterns;

import com.design.patterns.Wrapper.ChatSystem;
import com.design.patterns.Wrapper.PortugueseMessage;
import com.design.patterns.Wrapper.PortugueseToEnglishMessageAdapter;

public class Main {
    public static void main(String[] args) {

        PortugueseMessage portugueseMessage = new PortugueseMessage();
        ChatSystem adapter = new PortugueseToEnglishMessageAdapter(portugueseMessage);

        adapter.receiveMessageInEnglish("Hello, how are you?");
    }
}