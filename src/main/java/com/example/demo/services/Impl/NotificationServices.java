package com.example.demo.services.Impl;

import com.example.demo.Model.Chat;
import com.example.demo.Model.Notification;
import com.example.demo.Repository.ChatRepo;
import com.example.demo.Repository.NotificationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationServices {
    private final NotificationRepo notifRepo ;

    @Autowired
    public NotificationServices(NotificationRepo notifRepo) {
        this.notifRepo = notifRepo;
    }

    public Notification addNotif(Notification notif){
        notif.setDescription(UUID.randomUUID().toString());
        return notifRepo.save(notif) ;
    }
    public List<Notification> findAllNotif(){
        return notifRepo.findAll();
    }

    public Notification updateNotif(Notification notif){
        return notifRepo.save(notif);
    }

    public  void  deleteNotif(Long id){
        notifRepo.deleteNotifById(id); }
}
