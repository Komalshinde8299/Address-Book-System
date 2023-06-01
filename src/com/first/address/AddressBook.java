package com.first.address;

import java.util.Scanner;

public class AddressBook  implements IAddressMethods {
    Contact[] contactArray ;
    int maxiContact;
    int num = 0;

    public AddressBook(int maxiContact) {
        this.contactArray = new Contact[maxiContact];
        this.maxiContact = maxiContact;
        this.num = num;
    }


    public void addcontacts(Contact contact) {
        if (num < maxiContact) {
            contactArray[num] = contact;
            num++;

            System.out.println("\nContact Added successfully");
            System.out.println("----------------------------------------------------------");

        }
    }
    @Override
    public void display() {
        for (Contact contact : contactArray){
            System.out.println(contact);
        }


    }

    @Override
    public void editDetails(String name) {
        boolean contactFound = false;
        for(int i = 0; i < num; i++){
            if(contactArray[i].getFirstName().equalsIgnoreCase(name)){
                contactFound = true;

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your first name");
                String firstName = scanner.nextLine();

                contactArray[i].setFirstName(firstName);

                System.out.println("Enter your last name");
                String lastName = scanner.nextLine();
                contactArray[i].setLastName(lastName);

                System.out.println("Enter your full address");
                String address = scanner.nextLine();
                contactArray[i].setAddress(address);

                System.out.println("Enter your City");
                String city = scanner.nextLine();
                contactArray[i].setCity(city);

                System.out.println("Enter your State");
                String state = scanner.nextLine();
                contactArray[i].setState(state);

                System.out.println("Enter your Zip");
                int zipCode = scanner.nextInt();
                contactArray[i].setZipCode(zipCode);
                scanner.nextLine();

                System.out.println("Enter your Phone No");
                String phoneNo = scanner.nextLine();
                contactArray[i].setPhoneNo(phoneNo);

                System.out.println("Enter your Email");
                String email = scanner.nextLine();
                contactArray[i].setPhoneNo(email);


            }




        }


    }
}