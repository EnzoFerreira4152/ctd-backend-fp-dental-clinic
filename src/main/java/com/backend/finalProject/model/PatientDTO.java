package com.backend.finalProject.model;


import java.time.LocalDate;

public class PatientDTO {
    private Integer id;
    private String name;
    private String lastName;
    private Integer DNI;
    private LocalDate dischargeDate;
    private AddressDTO addressDTO;

    public PatientDTO() {}

    public Integer getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public LocalDate getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(LocalDate dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public AddressDTO getAddress() {
        return addressDTO;
    }

    public void setAddress(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

}
