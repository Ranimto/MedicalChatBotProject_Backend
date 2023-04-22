package com.example.demo.Contoller;

import com.example.demo.Model.Notification;
import com.example.demo.services.Impl.NotificationServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController
@RequestMapping("/Notification")
public class NotificationController {
    private final NotificationServices notificationService ;

    public NotificationController(NotificationServices notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Notification>> getAllNotif(){
        List<com.example.demo.Model.Notification> notifs= notificationService.findAllNotif();
        return new ResponseEntity<>(notifs, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Notification> addNotif(@RequestBody Notification notif){
        Notification newNotif=notificationService.addNotif(notif);
        return new ResponseEntity<>(newNotif, HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteNotif(@PathVariable("id") Long id) {
        notificationService.deleteNotif(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
