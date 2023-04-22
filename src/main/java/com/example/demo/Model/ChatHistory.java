package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chatHistory")
public class ChatHistory {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="History_time")
    private  String History_time;
    @Column(name="History_type")
    private  String  History_type;
    @Column(name="History_description")
    private String History_description;

}
