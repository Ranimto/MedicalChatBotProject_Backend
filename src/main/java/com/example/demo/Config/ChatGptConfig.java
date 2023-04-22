package com.example.demo.Config;

public class ChatGptConfig {
    public static final String AUTHORIZATION = "Bearer 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"; // This is a constant that is used as the name of the header field that contains the authorization token.
    public static final String BEARER = "Bearer "; // prefix to the authorization token.
    public static final String API_KEY = "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";
    public static final String MODEL = "text-davinci-003";
    public static final Integer MAX_TOKEN = 300;
    public static final Double TEMPERATURE = 0.0;
    public static final Double TOP_P = 1.0;
    public static final String MEDIA_TYPE = "application/json; charset=UTF-8"; //The media type used for HTTP requests to the OpenAI API.
    public static final String URL = "https://api.openai.com/v1/engines/text-davinci-003/completions"; // URL of the OpenAI API endpoint used to generate tex
}

//The ChatGptConfig class has several public static final fields that represent various values used in making requests to the OpenAI GPT-3 API.

//API_KEY is the value that is used to authenticate with the OpenAI API and obtain an access token, which is then used in
// the Authorization header of subsequent API requests.
//The authorization token and API key refer to the same thing.