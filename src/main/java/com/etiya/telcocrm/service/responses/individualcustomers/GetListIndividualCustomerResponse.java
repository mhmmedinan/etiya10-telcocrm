package com.etiya.telcocrm.service.responses.individualcustomers;

import com.etiya.telcocrm.service.responses.address.GetListAddressResponse;
import java.time.LocalDateTime;
import java.util.List;

public class GetListIndividualCustomerResponse {
    private int id;
    private String customerNumber;
    private String firstName;

    private String lastName;

    private String middleName;

    private String nationalId;

    private LocalDateTime dateOfBirth;

    private String motherName;

    private String fatherName;

    private String gender;

    private List<GetListAddressResponse> addresses;

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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<GetListAddressResponse> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<GetListAddressResponse> addresses) {
        this.addresses = addresses;
    }
}
