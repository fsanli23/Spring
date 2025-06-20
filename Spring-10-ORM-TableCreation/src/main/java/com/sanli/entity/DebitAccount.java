package com.sanli.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="debitAccountTable")
public class DebitAccount extends Account {

    private BigDecimal overDraftFee;
}
