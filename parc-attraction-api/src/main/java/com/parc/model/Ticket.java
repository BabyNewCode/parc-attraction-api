package com.parc.model;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double prix;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User acheteur;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public User getAcheteur() {
        return acheteur;
    }

    public void setAcheteur(User acheteur) {
        this.acheteur = acheteur;
    }
}