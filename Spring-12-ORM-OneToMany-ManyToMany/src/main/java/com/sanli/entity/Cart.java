package com.sanli.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "carts")
@Data
@NoArgsConstructor


public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany()
    @JoinTable(name = "car_item_rel",
            joinColumns = @JoinColumn(name = "c_id"), inverseJoinColumns = @JoinColumn(name =
            "i_id"))// convention for jointable and joincolumn
    private List<Item> item;

}
