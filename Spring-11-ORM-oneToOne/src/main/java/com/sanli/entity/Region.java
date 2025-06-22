package com.sanli.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regionId;

    private String country;
    private String region;
    @OneToOne(mappedBy = "region")
    private Employees employees;


    public Region(String country, String region) {
        this.country = country;
        this.region = region;
    }
}
