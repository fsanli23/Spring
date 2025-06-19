package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Employee {


    private String name;
    private String lastname;

    @Id
    private Long id;


}
