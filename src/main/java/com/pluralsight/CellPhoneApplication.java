package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        phone1.setModel("iPhone 16 Pro Max");
        phone1.setSerialNumber(6_735_076);
        phone1.setCarrier("AT&T");
        phone1.setPhoneNumber("678-999-8212");
        phone1.setOwnerName("Ajith V");

        CellPhone phone2 = new CellPhone();
        phone2.setModel("Galaxy Fold");
        phone2.setSerialNumber(8_097_123);
        phone2.setCarrier("Verizon");
        phone2.setPhoneNumber("911-911-1119");
        phone2.setOwnerName("Po Po");

        phone1.display();
        phone2.display();
    }
}
