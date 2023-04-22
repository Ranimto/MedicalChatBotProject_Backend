package com.example.demo.Contoller;

import com.example.demo.Model.Request.BotRequest;
import com.example.demo.Model.response.ChatGptResponse;


import com.example.demo.services.Impl.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/bot")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ChatGptController{

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage (@RequestBody String message) throws IOException {
        String apiEndpoint= "https://api.openai.com/v1/chat/completions";
        HttpHeaders headers=new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        System.out.println("HEEEERRRREEEEEE====");
        headers.set("Authorization","Bearer "+"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");
        headers.set("Access-Control-Allow-Origin", "*");
        RestTemplate restTemplate=new RestTemplate();
        HttpEntity<String> request=new HttpEntity<>(message,headers);

        ResponseEntity<String> response =restTemplate.exchange(apiEndpoint, HttpMethod.POST,request, String.class);
        System.out.println("RESPONSE BODY ====="+response.getBody());
       return response;
    }




}
