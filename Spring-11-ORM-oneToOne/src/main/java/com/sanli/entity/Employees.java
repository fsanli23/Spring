package com.sanli.entity;

import com.sanli.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data


public class Employees extends BaseEntity {

    private String firstName;
    private String lastName;


    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "department_id" )
    private Department department;


   @OneToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "redionId")
    private  Region region;




    public Employees(String firstName, String lastName, String email, LocalDate hireDate, Gender gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.gender = gender;
        this.salary = salary;
    }

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int salary;


}
