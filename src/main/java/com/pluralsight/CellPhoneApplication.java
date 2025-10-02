package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();
        Scanner scanner = new Scanner(System.in);

        System.out.println("What phone do you have: ");
        phone1.setModel(scanner.nextLine());
        System.out.println("What is your serial number: ");
        phone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Who is your carrier: ");
        phone1.setCarrier(scanner.nextLine());
        System.out.println("What is your phone number:");
        phone1.setPhoneNumber(scanner.nextLine());
        System.out.println("What is your name: ");
        phone1.setOwnerName(scanner.nextLine());

        CellPhone phone2 = new CellPhone();
        System.out.println("What phone do you have: ");
        phone2.setModel(scanner.nextLine());
        System.out.println("What is your serial number: ");
        phone2.setSerialNumber(scanner.nextInt());
        System.out.println("Who is your carrier: ");
        phone2.setCarrier(scanner.nextLine());
        System.out.println("What is your phone number:");
        phone2.setPhoneNumber(scanner.nextLine());
        System.out.println("What is your name: ");
        phone2.setOwnerName(scanner.nextLine());

        phone1.display();
        phone2.display();
    }
}
