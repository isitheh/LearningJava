package org.example;

import org.example.transport.Car;

import java.util.Random;    //Imports the Random Method into the local file.

/*
 * @Author: Sithembiso Sithole
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OCA world!");

        //Practice importing Java packages.
        Random random = new Random();
        System.out.println("Print a random number between 0-9. Random number: " + random.nextInt(10)); //Print a random number between 0-9.

        //Using the transport package. Creating objects
        Car mHonda = new Car();
        mHonda.setMake("Honda");
        mHonda.setMaxSpeed(100);
        System.out.println("The first car is a " + mHonda.getMake() + " and can travel at max speed of "
            + mHonda.getMaxSpeed() + "km/hr");
        Car mJeep = new Car();
        mJeep.setMake("Jeep");
        mJeep.setMaxSpeed(200);
        System.out.println("The second car is a " + mJeep.getMake() + " and can travel at max speed of "
                + mJeep.getMaxSpeed() + "km/hr");
        Car mMercedes = new Car();
        mMercedes.setMake("Mercedes");
        mMercedes.setMaxSpeed(220);
        System.out.println("The third car is a " + mMercedes.getMake() + " and can travel at max speed of "
                + mMercedes.getMaxSpeed() + "km/hr");
    }
}