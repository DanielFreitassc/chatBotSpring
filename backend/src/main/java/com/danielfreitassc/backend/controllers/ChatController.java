package com.danielfreitassc.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chatBot")
public class ChatController {
    
    @GetMapping
    public ResponseEntity<String> answerQuestion() {
        return ResponseEntity.ok("Oi");
    }
}
