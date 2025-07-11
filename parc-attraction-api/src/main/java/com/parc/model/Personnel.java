package com.parc.model;

import jakarta.persistence.*;

@Entity
public class Personnel {
    @Id @GeneratedValue private Long id;
    private String nom;
    private String role;

    @ManyToOne
    private Restaurant restaurant;
}
