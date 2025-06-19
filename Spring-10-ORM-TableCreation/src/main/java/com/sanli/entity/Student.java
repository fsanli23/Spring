package com.sanli.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Entity
public class Student {
    private String firstName;//first_name this is how springboot creates the column name
    private String lastName;

    private String email;

    @Id
    private Long id;


}
