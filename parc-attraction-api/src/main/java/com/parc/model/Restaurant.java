package com.parc.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Restaurant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @OneToMany(mappedBy = "restaurant")
    private Set<Personnel> personnel;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Personnel> getPersonnel() {
        return personnel;
    }

    public void setPersonnel(Set<Personnel> personnel) {
        this.personnel = personnel;
    }
}