package com.parc.dto;

import javax.validation.constraints.NotBlank;

public class AttractionDto {
    
    @NotBlank
    private String nom;

    @NotBlank
    private String type;

    private boolean ouverte;

    // Getters and Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isOuverte() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }
}