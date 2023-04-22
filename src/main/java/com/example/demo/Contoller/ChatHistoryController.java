package com.example.demo.Contoller;

import com.example.demo.Model.ChatHistory;
import com.example.demo.services.Impl.ChatHistoryServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ChatHistory")
public class ChatHistoryController {
    private final ChatHistoryServices chatHistoryService ;

    public ChatHistoryController(ChatHistoryServices chatHistoryService) {
        this.chatHistoryService = chatHistoryService;
    }

    @PostMapping("/add")
    public ResponseEntity<ChatHistory> addChatHist(@RequestBody ChatHistory chatHist){
        ChatHistory newChatH=chatHistoryService.addChatHistory(chatHist);
        return new ResponseEntity<>(newChatH, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<ChatHistory> UpdateChatHist(@RequestBody ChatHistory chatH){
        ChatHistory updatechatH=chatHistoryService.UpdateChatHist(chatH);
        return new ResponseEntity<>(updatechatH, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> DeleteChatHist(@PathVariable("id") Long id) {
        chatHistoryService.deleteChatHist(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
