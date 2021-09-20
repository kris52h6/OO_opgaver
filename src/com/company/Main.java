package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Opgave 1 - Person
        //

        Person person = new Person("Kristian", 24);
        // define name & age
        String name = person.getName();
        int age = person.getAge();

        // print name and age
        System.out.println(name);
        System.out.println(age);

        // increase age by 1
        person.hasBirthday();

        // print object
        System.out.println(person);

        // Opgave 2 - Dice
        //

        Dice dice = new Dice();
        int diceValue = dice.getFaceValue();

        System.out.print("The random dice value is: ");
        System.out.println(diceValue);
    }
}
