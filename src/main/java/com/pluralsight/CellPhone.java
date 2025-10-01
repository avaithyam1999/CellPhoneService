package com.pluralsight;

public class CellPhone {
    private String model;
    private int serialNumber;
    private String carrier;
    private String phoneNumber;
    private String ownerName;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void display() {
        System.out.printf("""
                Phone Model: %s
                Serial Number: %d
                Carrier Service: %s
                Phone Number: %s
                Owner Name: %s
                \n
                """, getModel(), getSerialNumber(), getCarrier(), getPhoneNumber(),getOwnerName());
    }


}
