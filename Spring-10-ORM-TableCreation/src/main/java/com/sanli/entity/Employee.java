package com.sanli.entity;

import jakarta.persistence.*;


@Entity
// common practice is that table name is plural while classes are singular
@Table(name = "employees")
// this is how we rename the table in DB if we don't want to use the default which is lowercase of the class
public class Employee {


    private String name;
    private String lastname;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;






}
