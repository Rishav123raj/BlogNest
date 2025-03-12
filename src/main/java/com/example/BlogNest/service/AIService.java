package com.example.blog.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AIService {

    @Value("${openai.api.key}")
    private String apiKey;

    private static final String OPENAI_URL = "https://api.openai.com/v1/completions";

    public String summarizeText(String text) {
        RestTemplate restTemplate = new RestTemplate();
        String requestBody = String.format("{\"model\": \"text-davinci-003\", \"prompt\": \"Summarize this text: %s\", \"max_tokens\": 100}", text);

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + apiKey);
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<String> request = new HttpEntity<>(requestBody, headers);
        String response = restTemplate.postForObject(OPENAI_URL, request, String.class);

        // Parse the response and return the summary
        return response; // You may need to parse the JSON response to extract the summary
    }
}