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
public class Admin {
    @Id
    @GeneratedValue
    private Long id;

    @Column( name = "Firstname")
    private  String fisrtname;

    @Column(name = "Lastname")
    private  String  lastname ;

    @Column(name = "Username")
    private  String  username ;



    @Column(name = "Email")
    private String email ;

    @Column(name = "Password")
    private String password ;
}
