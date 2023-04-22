package com.example.demo.services.Impl;

import com.example.demo.Model.Request.BotRequest;
import com.example.demo.Model.response.ChatGptResponse;

public interface  BotService {
    ChatGptResponse askQuestion(BotRequest botRequest);
}
