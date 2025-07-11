package com.parc.dto;

import javax.validation.constraints.NotBlank;

public class PersonnelDto {
    
    @NotBlank
    private String nom;

    @NotBlank
    private String role;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}