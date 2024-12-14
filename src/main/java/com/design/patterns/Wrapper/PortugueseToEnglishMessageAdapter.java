package com.design.patterns.Wrapper;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

public class PortugueseToEnglishMessageAdapter implements ChatSystem {
    PortugueseMessage portugueseMessage;

    public PortugueseToEnglishMessageAdapter(PortugueseMessage portugueseMessage) {
        this.portugueseMessage = portugueseMessage;
    }

    @Override
    public void receiveMessageInEnglish(String message) {
        System.out.println("Asking IA to translate the message: " + message);
        String translatedMessage = translateMessage(message);
        portugueseMessage.sendMessageInPortuguese(translatedMessage);
    }

    private String translateMessage(String message) {
        String beginingOfPrompt = "Traduza o texto a seguir para o português: ";

        // Above you can insert the key
        OpenAiService service = new OpenAiService("");
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt(beginingOfPrompt.concat(message))
                .model("gpt-3.5-turbo-instruct")
                .echo(true)
                .maxTokens(100)
                .build();

        List<CompletionChoice> choices = service.createCompletion(completionRequest).getChoices();
        choices.forEach(System.out::println);

        // Just get the fisrt to test.
        return choices.get(0).getText();
    }
}
