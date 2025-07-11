package com.parc.model;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id @GeneratedValue private Long id;
    private double prix;

    @ManyToOne
    private User acheteur;
}
