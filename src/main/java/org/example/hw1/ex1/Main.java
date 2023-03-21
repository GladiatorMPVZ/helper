package org.example.hw1.ex1;

import org.example.hw1.ex1.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = Person.builder()
                .setFirstName("ZMjte")
                .setMiddleName("jpx9t6jL")
                .setLastName("TMyk0T")
                .setAge(560)
                .setGender("M")
                .build();
        System.out.println(person1.toString());

    }
}