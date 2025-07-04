package com.sanli.entity;

import com.sanli.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data

public class Employee extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "department")
    private Department department;
    @ManyToOne
    private Region region;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }


    public Employee(){}







}
