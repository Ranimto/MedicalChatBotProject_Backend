package com.example.demo.Repository;

import com.example.demo.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification,Long> {
    void deleteNotifById(Long id);
}
