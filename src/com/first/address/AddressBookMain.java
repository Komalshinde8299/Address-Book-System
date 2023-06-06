package com.first.address;

import java.util.Scanner;

public class AddressBookMain{

    public static void main(String[] args) {
        System.out.println("* Welcome to Address Book Program ");
        System.out.println("If you want to add contact to Maharastra Zone Address book then enter '1'");
        System.out.println("If you want to add contact to Kerala Zone Address book then enter '2'");

        Scanner scanner = new Scanner(System.in);
        int checkZone = scanner.nextInt();
        if(checkZone == 1){
            System.out.println("* Welcome to Maharastra Zone Address Book ");

            System.out.println("\nEnter no of contacts you want to add ");

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
        } else if (checkZone == 2){

            mangeAddressBook();
        } else {
            System.out.println(" Invalid input");
        }

//        System.out.println("\nEnter First Name of contact which you want to remove");
//        String name = scanner.nextLine();
//        addressBook.editDetails(name);
//        addressBook.removeContact(name);
//        addressBook.display();


    }
    public static void mangeAddressBook(){
        System.out.println("* Welcome to Kerala Zone Address Book ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter no of contacts you want to add ");

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

    }




}
