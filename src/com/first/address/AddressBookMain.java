package com.first.address;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("* Welcome to Address Book Program ");
        Contact contact = new Contact();
        contact.setFirstName("Komal");
        contact.setLastName("Shinde");
        contact.setCity("Pune");
        contact.setPhoneNo("9922359618");
        contact.setAddress("Pune, Maharastra, India");
        contact.setState("Maharastra");
        contact.setEmail("komalshinde@gmail.com");
        contact.setZipCode(5678);

        System.out.println(contact.getFirstName());
        System.out.println(contact.getLastName());
        System.out.println(contact.getAddress());
        System.out.println(contact.getCity());
        System.out.println(contact.getState());
        System.out.println(contact.getPhoneNo());
        System.out.println(contact.getZipCode());
        System.out.println(contact.getEmail());






    }

}
