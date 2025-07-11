package com.parc.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id @GeneratedValue private Long id;
    private String nom;
    private int age;
    private boolean banni = false;

    @OneToMany(mappedBy = "acheteur")
    private List<Ticket> billets;
}
