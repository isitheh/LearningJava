package org.example;

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
    }
}