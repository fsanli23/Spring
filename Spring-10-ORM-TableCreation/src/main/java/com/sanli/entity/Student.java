package com.sanli.entity;


import com.sanli.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {

    @Column(name = "studentFirstName", length = 100)
// this is how we rename the column but still spring apply the underscore between each camelcase
    private String firstName;//first_name this is how springboot creates the column name
    private String lastName;

    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;


    @Transient// this city field is not going to be in the column because of the tag
    private String city;

    @Column(columnDefinition = "DATE")
    private LocalDate birthDate;

    @Column(columnDefinition = "TIME")
    private LocalTime birthTime;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime birthDateTime;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
