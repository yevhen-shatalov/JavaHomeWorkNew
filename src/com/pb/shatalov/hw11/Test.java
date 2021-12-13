package com.pb.shatalov.hw11;

public class Test {

    public static void main(String[] args) {
        Person myPhone = new Person();
        myPhone.setName("Eray");
        myPhone.setPhone("053356464");

        Person girlfriendPhone = new Person();
        girlfriendPhone.setName("Canan");
        girlfriendPhone.setPhone("0544654564");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(myPhone);
        phoneBook.add(girlfriendPhone);

        System.out.println(phoneBook);
    }

}
