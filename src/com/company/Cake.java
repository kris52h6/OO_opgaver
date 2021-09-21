package com.company;

public class Cake {
    // ingredients
    private double gramsOfSugar;
    private double amountOfEggs;
    private double teaSpoonsOfVanilla;
    private double gramsOfFlour;
    private double teaSpoonsOfBp;
    private double decilitersOfMilk;
    private double gramsOfButter;

    private int defaultAmountOfCake = 1;
    private int amountOfCake;
    private double weightOfIngredients;
    private double cakeKJContent;

    // weight of ingredients
    private double sugarWeight;
    private double eggWeight;
    private double vanillaWeight;
    private double flourWeight;
    private double bakingPowderWeight;
    private double milkWeight;
    private double butterWeight;

    // kJ
    private double sugarKj;
    private double eggKj;
    private double vanillaKj;
    private double flourKj;
    private double bakingPowderKj;
    private double milkKj;
    private double butterKj;

    public Cake(int amountOfCake) {
        // define how much of each ingredient for the cake
        this.gramsOfSugar = 75 * amountOfCake;
        this.amountOfEggs = 1 * amountOfCake;
        this.teaSpoonsOfVanilla = 0.125 * amountOfCake;
        this.gramsOfFlour = 70 * amountOfCake;
        this.teaSpoonsOfBp = 0.75 * amountOfCake;
        this.decilitersOfMilk = 0.5 * amountOfCake;
        this.gramsOfButter = 16.25 * amountOfCake;
        this.amountOfCake = defaultAmountOfCake * amountOfCake;

        // define weight based off how many people the cake is for
        this.sugarWeight = (1 * gramsOfSugar);
        this.eggWeight = (60 * amountOfEggs);
        this.vanillaWeight = (3 * teaSpoonsOfVanilla);
        this.flourWeight = (1 * gramsOfFlour);
        this.bakingPowderWeight = (3 * teaSpoonsOfBp);
        this.milkWeight = (100 * decilitersOfMilk);
        this.butterWeight = (1 * gramsOfButter);

        // define kJ
        this.sugarKj = (17 * gramsOfSugar);
        this.eggKj = (310 * amountOfEggs);
        this.vanillaKj = (12 * teaSpoonsOfVanilla);
        this.flourKj = (15 * gramsOfFlour);
        this.bakingPowderKj = (13 * teaSpoonsOfBp);
        this.milkKj = (44 * decilitersOfMilk);
        this.butterKj = (30 * gramsOfButter);

    }

    public double calculateWeightOfIngredients() {
        this.weightOfIngredients = sugarWeight += eggWeight += vanillaWeight += flourWeight
                += bakingPowderWeight += milkWeight += butterWeight;
        return weightOfIngredients;
    }

    public double calculateWeightOfCake() {
        return weightOfIngredients * 0.9;
    }

    public double getWeightOfIngredients() {
        return weightOfIngredients;
    }

    public double getCakeKjContent() {
        return cakeKJContent;
    }

    public double calculateKjContent() {
        this.cakeKJContent = sugarKj + eggKj+ vanillaKj
                + flourKj + bakingPowderKj + milkKj + butterKj;
        return cakeKJContent;
    }



    @Override
    public String toString() {
        return "Cake{" +
                "gramsOfSugar=" + gramsOfSugar +
                ", amountOfEggs=" + amountOfEggs +
                ", teaSpoonsOfVanilla=" + teaSpoonsOfVanilla +
                ", gramsOfFlour=" + gramsOfFlour +
                ", teaSpoonsOfBp=" + teaSpoonsOfBp +
                ", decilitersOfMilk=" + decilitersOfMilk +
                ", gramsOfButter=" + gramsOfButter +
                ", defaultAmountOfCake=" + defaultAmountOfCake +
                ", amountOfCake=" + amountOfCake +
                '}';
    }
}
