package com.example.demo.services.Impl;

import com.example.demo.Model.ChatHistory;
import com.example.demo.Model.Notification;
import com.example.demo.Repository.ChatHistoryRepo;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ChatHistoryServices {
    private final ChatHistoryRepo chatHistRepo ;
    @Autowired
    public ChatHistoryServices(ChatHistoryRepo chatHistRepo) {
        this.chatHistRepo = chatHistRepo;
    }
    public ChatHistory addChatHistory(ChatHistory chatHistory){
         //chatHistory.setId(UUID.randomUUID().toString());
         return chatHistRepo.save(chatHistory);
    }
    public ChatHistory UpdateChatHist(ChatHistory chatHistory) {
        return chatHistRepo.save(chatHistory);
    }
        public List<ChatHistory> findAllChat(){
            return chatHistRepo.findAll();
    }
    public void deleteChatHist(Long id){
        chatHistRepo.deleteChatHistoryById(id);
    }
}
