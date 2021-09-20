package com.company;

public class Room {

    public static void main(String[] args) {
        Lamp deskLamp = new Lamp(false);
        Lamp bedLamp = new Lamp(false);

        System.out.println(bedLamp);
        System.out.println(deskLamp);

        // Switch the lamps on
        System.out.println("Turn the lamps on");

        bedLamp.lampSwitch();
        deskLamp.lampSwitch();
        System.out.println(bedLamp);
        System.out.println(deskLamp);


    }
}
