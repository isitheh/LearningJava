package org.example;

import java.util.Arrays;

/*
 * @Author: Sithembiso Sithole
 */
public class TestMain {
    public static void main(String args[]) {
        //This is a comment, this line is ignored
        System.out.println("The main method.");
        System.out.println("The main method args: " + Arrays.toString(args));
        System.out.println("The main method args[0]: " + args[0]);
        System.out.println("The main method args[1]: " + args[1]);
    }

    /*
    *   This is a mains method (not an entry point to the program.
    *   This block is a multi line comment.
    */
    public static void mains(String args[]) {
        System.out.println("The mains method.");
    }
}
