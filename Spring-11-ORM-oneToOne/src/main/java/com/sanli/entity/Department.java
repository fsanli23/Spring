package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
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
