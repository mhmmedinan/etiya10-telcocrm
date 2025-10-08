package com.etiya.telcocrm.service.requests.address;

import jakarta.persistence.Column;

public class CreateAddressRequest {
    private String street;
    private String houseNumber;
    private String description;
    private boolean isDefault;
    private int districtId;
    private int customerId;


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

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public CreateAddressRequest(String street, String houseNumber, String description, boolean isDefault, int districtId, int customerId) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.description = description;
        this.isDefault = isDefault;
        this.districtId = districtId;
        this.customerId = customerId;
    }

    public CreateAddressRequest() {
    }
}
