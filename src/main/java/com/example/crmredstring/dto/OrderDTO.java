package com.example.crmredstring.dto;

import com.example.crmredstring.model.Client;
import jakarta.persistence.Column;

public class OrderDTO {

    private String typePresta;
    private String designation;
    private int nbDays;
    private double unitPrice;
    private String state;
    private Client client;

    public String getTypePresta() {
        return typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public int getNbDays() {
        return nbDays;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getState() {
        return state;
    }

    public Client getClient() {
        return client;
    }
}
