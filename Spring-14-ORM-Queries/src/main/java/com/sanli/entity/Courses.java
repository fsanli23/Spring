package com.sanli.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "COURSES")
@NoArgsConstructor
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "RATING")
    private String rating;
    @Column(name = "DESCRIPTION")
    private String description;


















}
