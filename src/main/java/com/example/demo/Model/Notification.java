package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Notification")
public class Notification {
    @Id
    @GeneratedValue
    private Long id;

    @Column( name = "Title")
    private  String title;

    @Column(name = "type")
    private  String  type ;

    @Column(name = "Description")
    private  String  description ;

}
