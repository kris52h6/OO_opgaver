package com.company;

public class Lamp {
    private boolean turnedOn;
    private boolean secondTurnedOn;

    public Lamp(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public Lamp(boolean turnedOn, boolean secondTurnedOn) {
        this.turnedOn = turnedOn;
    }

    public boolean getIsLampOn() {
        return turnedOn;
    }

    public void setTurnedOn() {

    }

    public int lampSwitch() {
        if (turnedOn) {
            this.turnedOn = false;
        } else
            this.turnedOn = true;
        return -1;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "turnedOn=" + turnedOn +
                ", secondTurnedOn=" + secondTurnedOn +
                '}';
    }
}
