package org.example;

import java.util.Arrays;

public class TestMain {
    public static void main(String args[]) {
        System.out.println("The main method.");
        System.out.println("The main method args: " + Arrays.toString(args));
        System.out.println("The main method args[0]: " + args[0]);
        System.out.println("The main method args[1]: " + args[1]);
    }

    public static void mains(String args[]) {
        System.out.println("The mains method.");
    }
}
