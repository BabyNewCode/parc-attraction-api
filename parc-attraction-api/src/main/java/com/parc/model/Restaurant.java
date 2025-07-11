package com.parc.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Restaurant {
    @Id @GeneratedValue private Long id;
    private String nom;

    @OneToMany(mappedBy = "restaurant")
    private List<Personnel> equipe;
}
