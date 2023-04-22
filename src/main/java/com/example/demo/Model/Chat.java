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
@Table(name="Admin")
public class Chat {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "description")
    private String description;

}
