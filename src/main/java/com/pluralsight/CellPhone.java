package com.pluralsight;

public class CellPhone {
    private String model;
    private int serialNumber;
    private String carrier;
    private String phoneNumber;
    private String ownerName;

    public CellPhone(String model, int serialNumber, String carrier, String phoneNumber, String ownerName) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.ownerName = ownerName;
    }

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
                """, this.model, this.serialNumber, this.carrier, this.phoneNumber,this.ownerName);
    }
    public void dial(CellPhone otherPhone) {
        System.out.printf("%s's %s is calling %s", ownerName, model, otherPhone.getPhoneNumber());
    }
}
