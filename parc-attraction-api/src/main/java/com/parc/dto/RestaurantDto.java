package com.parc.dto;

import javax.validation.constraints.NotBlank;

public class RestaurantDto {
    
    @NotBlank
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}