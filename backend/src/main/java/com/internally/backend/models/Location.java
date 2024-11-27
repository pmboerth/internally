package com.internally.backend.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String city;

    private String country;

    @ManyToMany(mappedBy = "companyLocations")
    private Set<Company> companies = new HashSet<>();

    protected Location() {
    }

    public Location(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public Set<Company> getCompanies() {
        return this.companies;
    }

    public long getID() {
        return this.id;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }
}
