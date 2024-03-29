package org.example.conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * @Author: Sithembiso Sithole
 */
public class ConditionalStatements {
    int hourOfDay = 9;
    public void exerciseConditionals() {
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        }  else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        /*
         * Note: In Java 0 and 1 are not valid boolean literals.
         * Only true and false are considered valid boolean values.
         * if(1) {}     - Invalid and does not compile
         * while(1) {}  - Invalid and does not compile
         */
        int x = (new Random()).nextInt(2);
        //if(x = 1) {} - Invalid and does not compile - Requires double, a relational equals operator (==)
        if(x == 1) {
            System.out.println("A relational equals operator (==) at work!");
        }
    }

    public void ternaryOperator() {
        // Generate random integers in range 0 to 9
        Random rand = new Random();
        int y = rand.nextInt(10);
        final int x;

        /*
         * First we write normal if statement.
         */
        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        System.out.println("Value of y = " + y);
        System.out.println("Value of x = " + x);

        /*
         * Next, we write same conditional using the ternary operator.
         * Ternary Operator;
         * Condition ? Expression 1 : Expression 2
         * If Condition is true, return Expression 1, else return Expression 2
         */
        final int x1 = (y > 5) ? (2 * y) : (3 * y);
        System.out.println("Value of y = " + y);
        System.out.println("Value of x1 = " + x1);

        /*
         * Ternary statements may return different types depending on
         * which expression was executed based on the given condition
         */
        System.out.println((y > 5) ? 21 : "value too large!");
        //int animal = (y > 3) ? 10 : "Horse";   //Invalid since string may be required to be stored in an int variable.

        //Ternary Operator Short Circuit Behaviour. Only executing the valid expression based on the condition
        int ternaryX = 1;
        int ternaryY = 1;
        final int ternaryZ = (y < 5) ? ternaryY++ : ternaryX++;
        System.out.println(ternaryY + ", " + ternaryX); //Since the condition is true, only the first expression executed
        System.out.println(ternaryZ);   //Returned value before incrementing (Post increment behaviour).
    }

    public void switchStatement() {
        // Generate random integers in range 0 to 6 - to represent days of the week.
        int dayOfWeek = (new Random()).nextInt(7);
        //Switch Statement
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a day");
                break;
        }
    }



    public void whileStatements() {
        // Generate random integers in range 0 to 99
        int rand = (new Random()).nextInt(100);
        int counter = rand;
        System.out.println("Loop is starting at: " + counter);
        /*
         * While Entry Control Loop:
         * Loop checks the condition on entry.
         */
        while(counter < 100) {
            counter++;
        }

        /*
         * Do While Exit Control Loop:
         * Loop checks the condition on exit.
         * Ensures body is executed at least once.
         */
        do {
            counter--;
        } while(counter > rand);
        System.out.println("Loop is ending at: " + counter);
    }

    public void forLoops() {
        //The for loop below will run infinitely.
        /*for(;;) {
            System.out.println("Hello For Loop World!");
        }*/
        /*
         * For Loop Syntax:
         * for(initializer; boolean expression; update statement) {
         *      //Body
         * }
         * Step 1: Initializer executes
         * Step 2: If boolean expression is true, continue, else exit the for loop.
         * Step 3: Execute the body
         * Step 4: Update statement executes
         * Step 5: Go to Step 2
         * Note: Initializer can have multiple comma separated statements with variables of the same type.
         * Note: Boolean condition can evaluate multiple conditions
         */
        // Generate random integers in range 0 to 9
        int rand = (new Random()).nextInt(10);
        System.out.println("rand: " + rand);
        for(long y = 0, z = 4; (rand < 5 && y < 10); rand++, y++) {
            System.out.println("rand: " + rand);
            System.out.println("y: " + y);
        }

        int x;
        long y;
        for(x = 2, y = 0; (x < 5 && y < 10); x++, y++) {
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }

    public void forEachLoops() {
        final String[] names = new String[3];    //Array with 3 String elements
        names[0] = "Jorge";
        names[1] = "Muzi";
        names[2] = "John";
        for (String name: names) {
            System.out.println("Hi! My name is: " + name);
        }

        List<String> mVals = new ArrayList<>();
        mVals.add("Bheki");
        mVals.add("Thabo");
        mVals.add("Ziphi");
        for (String val: mVals) {
            System.out.println("Hi again! Now my name is: " + val);
        }

        //for (int name: names) {} //Does not compile because the names array is of type String not int.
    }

    public void nestedLoops() {
        int[][] mComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        for(int[] mSimpleArray : mComplexArray) {
            for(int value : mSimpleArray) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        int x = 20;
        while(x > 0) {
            do {
                x -= 2;
            } while (x > 5);
            x--;
            System.out.print(x + "\t");
        }

        System.out.println();
        System.out.println();

        int[][] mMatrix = {{2, 1, 3}, {9, 8, 9}, {5, 7, 12}};
        for(int[] mList : mMatrix) {
            for(int val : mList) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        //Do a search and break upon match found.
        int searchVal = 8;
        int xIndex = -1;
        int yIndex = -1;

        MAINLOOP : for(int i = 0; i < mMatrix.length; i++) {
            //Search in each array of a matrix.
            for(int j = 0; j < mMatrix[i].length; j++) {
                //Check if a match has been found
                if(mMatrix[i][j] == searchVal) {
                    xIndex = i;
                    yIndex = j;
                    break MAINLOOP;
                }
            }
        }

        if(xIndex == -1 || yIndex == -1) {
            System.out.println("No match has been found.");
        } else {
            System.out.println("Match has been found at position x: " + xIndex + " y: " + yIndex);
        }
    }

    public void PossibleExamQuestions() {
        byte xByte = 5;
        byte yByte = 10;
        int zByte = xByte + yByte;
        System.out.println("zByte: " + zByte);
        byte wByte = (byte) (xByte + yByte);
        System.out.println("wByte: " + wByte);

        long x = 10;
        int y = (int) (2 *  x);
        System.out.println("y: " + y);
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        int res = (x > 2) ? ((x < 4) ? 10 : 8 ) : 7;
        System.out.println("Introduce Parentheses reduce confusion: " + res);
        for(int i = 0; i < 10; ) {
            i++;
            //i=i++;
            System.out.println(i);
            System.out.println("Hello World!");
        }

        int xVal = 5 * 4 % 3;
        int yVal = 3;
        boolean b = xVal >= yVal;
        System.out.println(xVal);
        String s = null;
        //if(x == s) {} Does not compile.
        if(b=true) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        boolean isTest = false;
        System.out.println(isTest = true);
        System.out.println(isTest = false);
    }
}
