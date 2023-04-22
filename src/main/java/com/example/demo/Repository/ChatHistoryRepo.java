package com.example.demo.Repository;

import com.example.demo.Model.ChatHistory;
import com.example.demo.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatHistoryRepo extends JpaRepository<ChatHistory,Long> {
    void deleteChatHistoryById(Long id);
}
