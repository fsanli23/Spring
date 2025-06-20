package com.sanli.entity;

import com.sanli.enums.Gender;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long EmployeeId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hiringDate;
    private String department;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
