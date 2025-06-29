package com.sanli.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String name;
    private String lastName;
    private String email;
    private String address;
    @OneToMany(mappedBy = "customer",fetch = FetchType.LAZY)// default is eager
    private List<Payment> payments;

    public Customer(String userName, String name, String lastName, String email, String address) {
        this.userName = userName;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

}
