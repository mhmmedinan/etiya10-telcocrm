package com.etiya.telcocrm.model.entities;

import com.etiya.telcocrm.core.entities.BaseEntity;
import jakarta.persistence.*;


@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street",nullable = false)
    private String street;

    @Column(name = "houseNumber",nullable = false)
    private String houseNumber;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "isDefault",nullable = false)
    private boolean isDefault;

    @ManyToOne()
    @JoinColumn(name ="district_id")
    private District district;

    @ManyToOne()
    @JoinColumn(name ="customer_id")
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public Address(int id, String street, String houseNumber, String description, boolean isDefault) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.description = description;
        this.isDefault = isDefault;
    }

    public Address() {
    }
}
