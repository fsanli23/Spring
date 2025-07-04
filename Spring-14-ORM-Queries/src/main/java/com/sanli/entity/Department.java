package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
public class Department  {

    @Id
    private String department;

    private String division;


    @Override
    public String toString() {
        return "Department{" +
                "department='" + department + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
