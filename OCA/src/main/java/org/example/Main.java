package org.example;

import org.example.transport.Car;
import org.example.transport.WaterBottle;

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
        waterBottle();
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

    /*
     * OCA practice questions
     */
    private static void ocaPracticeQuestions() {
        //Identifiers
        int A$B = 10;           //Valid - $ is valid in identifiers.
        int _helloword = 1;     //Valid - underscore is valid in identifiers
        //int true = 0;         //Invalid - true is a reserved Java keyword
        //int  java.lang = 0;   //Invalid - dot not valid in identifiers.
        int Public = 0;         //Valid - public is a reserved keyword but not Public
        //int 1980_s = 0;       //Invalid - Identifier may not start with a number
    }

    /*
    * empty is a boolean primitive variable and initializes to false.
    * brand is a String non-primitive variable and initializes to null.
    * */
    private static void waterBottle() {
        WaterBottle wb = new WaterBottle();
        System.out.println("Empty = " + wb.empty);
        System.out.println("Band = " + wb.brand);
    }

    private static void checkCompileErrors() {
        short numPets = 5;
        //int numGrains = 5.6;      //Line generates a compile error - given object is float integral.
        String name = "Scruffy";
        //numPets.length();         //Primitves do not allow methods to be called on them
        //numGrains.length();       //Primitves do not allow methods to be called on them
        System.out.println(name.length());
    }
}