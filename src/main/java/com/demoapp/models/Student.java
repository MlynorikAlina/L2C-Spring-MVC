package com.demoapp.models;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;

    private final LinkedHashMap<String,String> countryOptions = new LinkedHashMap<>();

    {
        countryOptions.put("BR","Brazil");
        countryOptions.put("FR","France");
        countryOptions.put("US","USA");
        countryOptions.put("RU","Russia");
        countryOptions.put("CA","Canada");
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
