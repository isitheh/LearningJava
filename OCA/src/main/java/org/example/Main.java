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
        System.out.println("All our cars have a maximum number of wheels set to: " + Car.MAX_WHEELS);
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

        Primitives primitives = new Primitives();
        ReferencesAndObjects();
    }

    /*
    * To learn more about references and objects, in our function ReferencesAndObjects
    * we write what is happening before and after each line of code presented.
    */
    private static void ReferencesAndObjects() {
        //Created references stringOne and stringTwo which can map to string objects
        String stringOne, stringTwo;
        //An object of type String "a" is then assigned to the stringOne reference.
        //The stringOne reference now maps to this object in the Java heap memory.
        stringOne = "a";
        //An object of type String "b" is then assigned to the stringTwo reference.
        //The stringTwo reference now maps to this object in the Java heap memory.
        stringTwo = "b";
        //The object mapped to reference stringTwo is now also mapped to stringOne
        stringOne = stringTwo;
        //Created a reference stringThree which can map to a string object
        //The object mapped to reference stringOne is now also mapped to stringThree
        String stringThree = stringOne;
        //The reference stringOne is now mapped to a null
        stringOne = null;
    }
}