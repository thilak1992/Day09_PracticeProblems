package com.Bridgelabz.Day09AddressBook;

import java.util.Scanner;

public class AddressBookUC2 {
    public void address(String First_Name, String Last_Name, String Address, String City, String State, int Zip,
                        String PhoneNo, String Email) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First name  ");
        First_Name = scanner.nextLine();
        System.out.println("Enter Last name ");
        Last_Name = scanner.nextLine();
        System.out.println("Enter Address ");
        Address = scanner.nextLine();
        System.out.println("Enter city name ");
        City = scanner.nextLine();
        System.out.println("Enter State name ");
        State = scanner.nextLine();
        System.out.println("Enter Zip Code");
        Zip = scanner.nextInt();
        System.out.println("Enter phone Number ");
        PhoneNo = scanner.next();
        System.out.println("Enter Email Id ");
        Email = scanner.next();

        System.out.println("\n First Name -" + First_Name + "\n Last Name -" + Last_Name + "\n Address -" + Address
                + "\n City Name -" + City + "\n State Name -" + State + "\n Zip code -" + Zip + "\n Phone number -"
                + PhoneNo + "\n Email id -" + Email);

    }
}
