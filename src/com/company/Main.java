package com.company;

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
        Dice[] dieArray = new Dice[5];

        // loop through the array and create a new dice with a new faceValue,
        // and then place it in the array at position i
        for (int i = 0; i < dieArray.length; i++) {
            dieArray[i] = new Dice();
        }

        System.out.print("The values of the 5 dice roll are : ");
        for (int i= 0; i < dieArray.length; i++) {
            System.out.print(dieArray[i].getFaceValue() + " ");
        }
        System.out.print("\n\n");

        // Opgave 4 - kage
        //

        Cake cake = new Cake(4);
        System.out.println(cake);
        System.out.print("\n");

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
