package com.example.crmredstring.dto;

import jakarta.persistence.Column;

public class ClientDTO {

    private String companyName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String zipCode;
    private String city;
    private String country;
    private int state;

    public String getCompanyName() {
        return companyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getState() {
        return state;
    }
}
