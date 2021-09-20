package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void hasBirthday() {
        age += 1;
    }

    public String toString() {
        return "Person{" + "name: " + name + ", "
                + "age :" + age + "}";
    }
}
