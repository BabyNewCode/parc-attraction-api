package com.parc.dto;

import javax.validation.constraints.NotBlank;

public class TicketDto {
    
    @NotBlank
    private double prix;

    public TicketDto() {
    }

    public TicketDto(double prix) {
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}