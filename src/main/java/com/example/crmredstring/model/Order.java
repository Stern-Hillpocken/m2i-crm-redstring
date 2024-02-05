package com.example.crmredstring.model;

import com.example.crmredstring.enums.OrderStateEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type_presta")
    private String typePresta;
    private String designation;
    @ManyToOne
    private Client client;
    @Column(name = "nb_days")
    private int nbDays;
    @Column(name = "unit_price", columnDefinition = "NUMERIC(10,2)")
    private double unitPrice;
    @Column(name = "total_exclude_taxe", columnDefinition = "NUMERIC(10,2)")
    private double totalExcludeTaxe;
    @Column(name = "total_with_taxe", columnDefinition = "NUMERIC(10,2)")
    private double totalWithTaxe;
    private int state;

    public Order() {}

    public Order(String typePresta, String designation, Client client, int nbDays, double unitPrice, String state) {
        this.typePresta = typePresta;
        this.designation = designation;
        this.client = client;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
        this.totalExcludeTaxe = unitPrice * nbDays;
        this.totalWithTaxe = unitPrice * nbDays * 1.2;
        this.state = OrderStateEnum.valueOf(state).ordinal();
    }

    public int getId() {
        return id;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public Client getClient() {
        return client;
    }

    public int getNbDays() {
        return nbDays;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public double getTotalWithTaxe() {
        return totalWithTaxe;
    }

    public int getState() {
        return state;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setState(int state) {
        this.state = state;
    }
}
