package com.first.address;

import java.util.Scanner;

public class AddressBookMain{

    public static void main(String[] args) {
        System.out.println("* Welcome to Address Book Program ");


        Scanner scanner = new Scanner(System.in);
        System.out.println("For storing multiple contacts in address book");
        System.out.println("Enter no of contacts you want to add ");

        int no = scanner.nextInt();
        AddressBook addressBook = new AddressBook(no);
        scanner.nextLine();

        for (int i = 0; i < no; i++) {
            Contact obj = new Contact();


            System.out.println("Enter your first name");
            String firstName = scanner.nextLine();

            obj.setFirstName(firstName);

            System.out.println("Enter your last name");
            String lastName = scanner.nextLine();
            obj.setLastName(lastName);

            System.out.println("Enter your full address");
            String address = scanner.nextLine();
            obj.setAddress(address);

            System.out.println("Enter your City");
            String city = scanner.nextLine();
            obj.setCity(city);

            System.out.println("Enter your State");
            String state = scanner.nextLine();
            obj.setState(state);

            System.out.println("Enter your Zip");
            int zipCode = scanner.nextInt();
            obj.setZipCode(zipCode);
            scanner.nextLine();

            System.out.println("Enter your Phone No");
            String phoneNo = scanner.nextLine();
            obj.setPhoneNo(phoneNo);

            System.out.println("Enter your Email");
            String email = scanner.nextLine();
            obj.setPhoneNo(email);

            addressBook.addcontacts(obj);

        }

        System.out.println("Contacts from address book");
        addressBook.display();

//        System.out.println("\nEnter First Name of contact which you want to remove");
//        String name = scanner.nextLine();
//        addressBook.editDetails(name);
//        addressBook.removeContact(name);
//        addressBook.display();


    }




}
