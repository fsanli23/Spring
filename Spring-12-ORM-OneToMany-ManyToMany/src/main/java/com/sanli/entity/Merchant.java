package com.sanli.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@Table(name = "merchants")
@NoArgsConstructor
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer paymentDelayCount;
    @OneToMany(mappedBy = "merchant")//in one-to-many relationship ownership belongs to many side
    private List<Payment> payment;

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer paymentDelayCount ) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.paymentDelayCount = paymentDelayCount;

    }
}
