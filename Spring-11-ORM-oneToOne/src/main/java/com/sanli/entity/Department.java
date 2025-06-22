package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor

@Table(name = "departments")
@Data
public class Department extends BaseEntity {

    private String department;
    private String division;
    @OneToOne(mappedBy = "department")
    private Employees employees;

    public Department(String department, String division) {
        this.department = department;
        this.division = division;
    }


}
