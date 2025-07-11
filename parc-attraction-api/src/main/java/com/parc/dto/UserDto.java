package com.parc.dto;

import javax.validation.constraints.NotBlank;

public class UserDto {
    
    @NotBlank
    private String nom;

    private int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}