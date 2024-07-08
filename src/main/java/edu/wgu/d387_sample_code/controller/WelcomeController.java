package edu.wgu.d387_sample_code.controller;


import edu.wgu.d387_sample_code.Internationalization.MessageRetriever;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.HashMap;
import java.util.Map;


@RestController
@CrossOrigin(origins = "http://localhost:4200") // Allow requests from Angular app
public class WelcomeController {

    private final MessageRetriever messageRetriever;

    public WelcomeController(MessageRetriever messageRetriever) {
        this.messageRetriever = messageRetriever;
    }

    @GetMapping("/welcome")
    public ResponseEntity<Map<String, String>> getWelcomeMessages() {
        messageRetriever.setLocale("en", "US");
        String englishWelcomeMessage = messageRetriever.getWelcomeMessage();

        messageRetriever.setLocale("fr", "CA");
        String frenchWelcomeMessage = messageRetriever.getWelcomeMessage();

        Map<String, String> welcomeMessages = new HashMap<>();
        welcomeMessages.put("english", englishWelcomeMessage);
        welcomeMessages.put("french", frenchWelcomeMessage);

        return ResponseEntity.ok(welcomeMessages);
    }
}