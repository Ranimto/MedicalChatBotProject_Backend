package com.example.demo.services.Impl;

import com.example.demo.Config.ChatGptConfig;
import com.example.demo.Model.response.ChatGptResponse;
import com.example.demo.Model.Request.BotRequest;
import com.example.demo.Model.Request.ChatGptRequest;
import org.springframework.stereotype.Service;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;


@Service
public class ChatGptService  implements BotService{



    private static RestTemplate restTemplate = new RestTemplate();

    //    HTTP Request Entity (body= chatGptRequest + Headers= authorization)
    //    Build headers
    public HttpEntity<ChatGptRequest> buildHttpEntity(ChatGptRequest chatRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(ChatGptConfig.MEDIA_TYPE));
        headers.add(ChatGptConfig.AUTHORIZATION, ChatGptConfig.BEARER + ChatGptConfig.API_KEY);
        chatRequest.setModel(ChatGptConfig.MODEL);
        return new HttpEntity<>(chatRequest, headers);
    }

    //    Generate body of responseEntity
    public ChatGptResponse getResponse(HttpEntity<ChatGptRequest> chatRequestHttpEntity) {
        ResponseEntity<ChatGptResponse> responseEntity = restTemplate.postForEntity(
                ChatGptConfig.URL,
                chatRequestHttpEntity,
                ChatGptResponse.class);

        return responseEntity.getBody();
    }

    //Generate response from botRequest
    @Override
    public ChatGptResponse askQuestion(BotRequest botRequest) {
        return this.getResponse(
                this.buildHttpEntity(
                        new ChatGptRequest(
                                ChatGptConfig.MODEL,
                                botRequest.getMessage(),
                                ChatGptConfig.TEMPERATURE,
                                ChatGptConfig.MAX_TOKEN,
                                ChatGptConfig.TOP_P)));

    }
}
