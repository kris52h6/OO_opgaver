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

        // Opgave 2 - Dice
        //

        Dice dice = new Dice();
        int diceValue = dice.getFaceValue();

        System.out.print("The random dice value is: ");
        System.out.println(diceValue);

        // Opgave 4 - kage
        //

        Cake cake = new Cake(4);
        System.out.println(cake);

        double weightOfIngredients = cake.calculateWeightOfIngredients();
        System.out.print("The total weight of the ingredients is: ");
        System.out.printf("%.2f g\n",weightOfIngredients);



        double weightOfCake = cake.calculateWeightOfCake();
        System.out.print("The weight of the finished cake is: ");
        System.out.printf("%.2f g\n",weightOfCake);


        double kjContent = cake.calculateKjContent();
        System.out.print("The total kJ content of the cake is: ");
        System.out.printf("%.0f kJ", kjContent);




    }
}
