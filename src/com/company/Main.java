package com.company;

public class Main {

    public static void main(String[] args) {
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
    }
}
