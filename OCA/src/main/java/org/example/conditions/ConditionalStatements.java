package org.example.conditions;

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
}
