package com.first.address;

import java.util.Scanner;

public class AddressBookMain implements IAddressMethods{
    public static void main(String[] args) {
        System.out.println("* Welcome to Address Book Program ");

        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContacts();

    }
    @Override
    public void addContacts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        Contact obj = new Contact();
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

        System.out.println("Enter 1 if you want to see which details you have added");
        int check = scanner.nextInt();
        if(check == 1){
            System.out.println(obj.getFirstName());
            System.out.println(obj.getLastName());
            System.out.println(obj.getAddress());
            System.out.println(obj.getCity());
            System.out.println(obj.getState());
            System.out.println(obj.getZipCode());
            System.out.println(obj.getPhoneNo());
            System.out.println(obj.getEmail());
            System.out.println("Thank you for adding information");

        } else {
            System.out.println("Thank you for adding information");
        }




    }


}
