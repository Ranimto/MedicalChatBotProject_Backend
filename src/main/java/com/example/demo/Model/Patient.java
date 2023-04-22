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
@Table(name="Patient")
public class Patient {
    @Id
    @GeneratedValue
    private Long id;

    @Column( name = "firstname")
    private  String firstname;

    @Column(name = "lastname")
    private  String  lastname ;

    @Column(name = "email")
    private String email ;

    @Column(name = "password")
    private String password ;

    @Column(name = "confPassword")
    private String confirm_Password ;
}
