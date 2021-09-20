package com.company;

import java.util.Random;

public class Dice {
    private int faceValue;

    public Dice() {
        this.faceValue = roll();
    }

    public int roll() {
        Random rand = new Random();
        int number = rand.nextInt(6);
        number += 1;
        return number;
    }

    public int getFaceValue() {
        return faceValue;
    }


}
