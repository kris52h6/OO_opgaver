package com.company;

import java.util.Arrays;

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
        System.out.println();

        // Opgave 2 - Dice
        //

        Dice dice = new Dice();
        int diceValue = dice.getFaceValue();

        Dice[] array = new Dice[5];
        // loop through the array and create a new dice with a new faceValue,
        // and then place it in the array at position i
        for (int i = 0; i < array.length; i++) {
            dice = new Dice();
            diceValue = dice.getFaceValue();
            array[i] = dice;

        }

        System.out.print("The values of the 5 dice roll are : ");
        for (int i= 0; i < array.length; i++) {
            System.out.print(array[i].getFaceValue() + " ");
        }

        System.out.println();
        System.out.println();
/*        System.out.print("\nThe random dice value is: ");
        System.out.println(diceValue);
        */

        // Opgave 4 - kage
        //

        Cake cake = new Cake(4);
        System.out.println(cake);

        // ingredients weight
        double weightOfIngredients = cake.calculateWeightOfIngredients();
        System.out.print("The total weight of the ingredients is: ");
        System.out.printf("%.2f g\n",weightOfIngredients);

        // cake weight
        double weightOfCake = cake.calculateWeightOfCake();
        System.out.print("The weight of the finished cake is: ");
        System.out.printf("%.2f g\n",weightOfCake);

        // kJ content
        double kjContent = cake.calculateKjContent();
        System.out.print("The total kJ content of the cake is: ");
        System.out.printf("%.0f kJ", kjContent);
        System.out.println();




    }
}
