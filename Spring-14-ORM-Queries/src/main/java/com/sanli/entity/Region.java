package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@Table(name = "regions")
public class Region extends BaseEntity {


    private String region;
    private String country;

    @Override
    public String toString() {
        return "Region{" +
                "region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
