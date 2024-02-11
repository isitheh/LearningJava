package org.example;

import java.util.Arrays;

//Compile error: 'Date' is ambiguous. Both java.util and java.sql contain 'Date'
//import java.util.*;
//import java.sql.*;

/*
* Solve as below:
* This works since explicit class imports take precedence over wildcard class imports.
* Since java.util.Date class is imported explicitly, the program will not import the
* java.sql.Date from the wildcard import java.sql.*.
*/
import java.util.Date;
import java.sql.*;

/*
 * @Author: Sithembiso Sithole
 */
public class TestMain {
    public static void main(String args[]) {
        //This is a comment, this line is ignored
        System.out.println("The main method.");
        System.out.println("The main method args: " + Arrays.toString(args));
        doDateExample();
    }

    /*
    *   This is a mains method (not an entry point to the program.
    *   This block is a multi line comment.
    */
    public static void mains(String args[]) {
        System.out.println("The mains method.");
    }

    private static void doDateExample() {
        Date mDate = new Date(); //This Date belongs to the util package
        /*
        * To use Date from the sql package, we have to now declare it inline as a fully qualified class name.
        */
        long mSqlDate = 0;
        java.sql.Date sqlDate = new java.sql.Date(mSqlDate);
    }
}
