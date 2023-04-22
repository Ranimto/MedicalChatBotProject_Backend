package com.example.demo.Repository;

import com.example.demo.Model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepo extends JpaRepository<Chat,Long > {
    void deleteChatById(Long id);
}
