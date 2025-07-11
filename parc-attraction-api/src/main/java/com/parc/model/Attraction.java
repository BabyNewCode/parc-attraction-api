package com.parc.model;

import jakarta.persistence.*;

@Entity
public class Attraction {
    @Id @GeneratedValue private Long id;
    private String nom;
    private String type;
    private boolean ouverte = true;
}
