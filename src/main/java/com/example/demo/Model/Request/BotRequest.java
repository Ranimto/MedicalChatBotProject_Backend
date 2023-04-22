package com.example.demo.Model.Request;

import lombok.Data;

import java.io.Serializable;

@Data
public class BotRequest implements Serializable {
    private String message;


}

//BotRequest class is a simple request object with a single field message.
// It is likely used to represent a user's message to a chatbot