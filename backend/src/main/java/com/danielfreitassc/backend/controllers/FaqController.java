package com.danielfreitassc.backend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.danielfreitassc.backend.dtos.MessageRequest;
import com.danielfreitassc.backend.dtos.MessageResponse;
import com.danielfreitassc.backend.services.FaqService;

@RestController
@RequestMapping("/api/chat")
public class FaqController {
    final private FaqService faqService;

    public FaqController(FaqService faqService){
        this.faqService = faqService;
    }

    @PostMapping
    public ResponseEntity<MessageResponse> answerQuestion(@RequestBody MessageRequest request){
        String answer = this.faqService.getAnswer(request.message());
        MessageResponse response = new MessageResponse(answer);
        return ResponseEntity.ok(response);
    }
}