package org.example.operatorsandstatements;

/*
 * @Author: Sithembiso Sithole
 */
public class Operators {

    public void precedence() {
        int y = 4;
        double x = 3 + 2 * --y;
        /* Sequence of steps for this operation is as below:
         * Step 1: Decrement y (--y)
         * Step 2: Multiply the result of Step 1 by 2
         * Step 3: Add 3 to the result of Step 2
         */
        System.out.println("Operators precedence y = " + y);
        System.out.println("Operators precedence x = " + x);
    }

    public void divideVsModulo() {
        int x = 10 / 5;     //Returns a Quotient = 2
        int y = 10 % 5;     //Returns a Remainder = 0
    }

    public void numericalPromotion() {
        /*
         *  When literals of different types are operated on, the result
         *  assumes the type of the literal which is the larger of the two.
         */
        int x1 = 5;
        long x = 3;
        //x * x1        Returns a result of type long.

        double d1 = 39.21;
        //float f1 = 2.1;   Float requires F to be used as a floating point literal.
        float f2 = 2.1F;
        //d1 + f2       Returns a result of type double.

        /*
         * Smaller data types (char, byte, short) are first promoted to int anytime
         * they get used with a binary arithmetic operator.
         */
        short is1 = 10;
        short is2 = 3;
        System.out.println("Result = (is1 / is2) = " + (is1 / is2));  //Results in an int Quotient.

        /*
         * If one value is an integral and is operated with a floating point it always gets promoted into a float.
         */
        short varShort = 14;
        float varFloat = 13;
        double varDouble = 30;
        /*
         * Steps to compute Result = (varShort * varFloat/ varDouble)
         * Step 1: varShort is promoted into an int - short literal used in an arithmetic operation.
         * Step 2: varShort, now an int, is promoted into a floating point.
         * Step 3: varShort, now a float, is multiplied with varFloat resulting in a floating point value.
         * Step 4: The result of Step 3 is then divided by varDouble, the result is type double.
         */
        System.out.println("Result = (varShort * varFloat/ varDouble) = " + (varShort * varFloat/ varDouble));
    }

    public void operatorTypes() {
        /*
         * Binary/Bitwise operators
         * Used to perform manipulation of individual bits of the given number.
         */

        /*
         * Bitwise OR '|' Example
         *       0101
         * OR    0111
         * ------------
         * Res = 0111
         * ------------
         * Result is represented as an integer.
         */
        int i1 = 5;     //Converted to 0101
        int i2 = 7;     //Converted to 0111
        System.out.println("Result = 5 | 7 = " + (i1 | i2));

        /*
         * Bitwise AND '&' Example
         *       0101
         * AND   0111
         * ------------
         * Res = 0101
         * ------------
         * Result is represented as an integer.
         */
        int x1 = 5;     //Converted to 0101
        int x2 = 7;     //Converted to 0111
        System.out.println("Result = 5 & 7 = " + (x1 & x2));

        /*
         * Bitwise XOR '^' Example
         *       0101
         * XOR   0111
         * ------------
         * Res = 0010
         * ------------
         * Result is represented as an integer.
         */
        int z1 = 5;     //Converted to 0101
        int z2 = 7;     //Converted to 0111
        System.out.println("Result = 5 ^ 7 = " + (z1 ^ z2));

        /*
         * Bitwise Ones Complement '~' Example
         * ~ 0101
         * ------------
         * Res = 1010
         * ------------
         * Result is represented as an integer.
         */
        int c1 = 5;     //Converted to 0101
        System.out.println("Result = ~5 = " + ~c1);
    }

    public void unaryOperators() {
        /*
         *  Not Operator: '!' - Inverts a boolean logical value
         */
        boolean isReal = false;
        isReal = !isReal;
        System.out.println("Value of isReal: " + isReal);
        //int val = !5;       //Does not compile. Not operator cannot be used on non boolean literals.
        /*
         *  Minus: '-' - Indicates a negative number/Negates an expression
         */
        double y = 1.21;
        double x = -y;
        System.out.println("Value of y: " + y);
        System.out.println("Value of x: " + x);
        /*
         *  Incremental: '++' - Increments a value by 1
         *  ++val - pre incremental operator
         *  val++ - post incremental operator
         */
        int val = 5;
        int myPreIncremental = ++val;   //val is first incremented then results assigned to the variable
        System.out.println("val: " + val);
        System.out.println("myPreIncremental: " + myPreIncremental);

        int val2 = 5;
        int myPostIncremental = val2++;   //val is first assigned to the variable then incremented when used next;
        System.out.println("val2: " + val2);
        System.out.println("myPostIncremental: " + myPostIncremental);

        /*
         *  Decremental: '--' - Decrements a value by 1
         *  --val - pre decremental operator
         */
        int valMinus = 5;
        int myPreDecremental = --valMinus;   //val is first decremented then results assigned to the variable
        System.out.println("valMinus: " + valMinus);
        System.out.println("myPreDecremental: " + myPreDecremental);

        int val2Minus = 5;
        int myPostDecremental = val2Minus--;   //val is first assigned to the variable then decremented when used next;
        System.out.println("val2Minus: " + val2Minus);
        System.out.println("myPostDecremental: " + myPostDecremental);

        /*
         * Example
         * Step 1: Increment mValueX (4)
         * Step 2: Multiply the result of Step 1 by 5 (20)
         * Step 3: Divide the result of Step 2 by result of Step 1. (5)
         * Step 4: Decrement the result of Step 1 (3)
         * Step 5: Decrement the result of Step 4 (2)
         * Step 6: Add the result of Step 5 to the result of Step 3 (7)
         */
        int mValueX = 3;
        int mValueY = ++mValueX * 5 / mValueX-- + --mValueX;
        System.out.println(mValueX);
        System.out.println(mValueY);
    }

    public void assignmentOperators() {
        double x = 1;           //Assigns an integer 1 to a double variable x converts the 1 to a double literal 1.0
        //long ml = 123654897966788;   //The literal is assigned as an integer value hence the compile error.
        long ml2 = 123654897966788L;   //The literal is now assigned as a long by specifying the L at the end.
        //int z = 9.0;                 //Compile error assigning a floating point into an integer variable.
        //int z1 = 9.0f;               //Compile error assigning a floating point into an integer variable.
        System.out.println(x);

        /*
         * int x1 = 1.0;
         * Attempts to assign a double literal 1.0 into an int variable, causing a compilation error.
         * Use typecasting to forcefully convert a larger data type, this time double, into a smaller data type, int
         */
        int x1 = (int) 1.0;
        System.out.println(x);

        /*
         * Overflowing
         * An attempt to type cast a literal into a data type into which it can not fit causes the variable to overflow.
         * In the example below, a primitive type byte range [-128, 127]. Assigned and type cast a value of 130.
         * 130 overflows from the upper range by a value of 2. Hence, the literal wraps around back to -128 and adds
         * the value to resulting in an answer of -126.
         */
        byte mByte = (byte) 130;
        System.out.println("mByte = " + mByte);

        /*
         * Example:
         * doVar1 and doVar2 declared as a short, get converted into an int because the Java compiler converts all
         * (char, byte, short) literals into an int when a binary operation is performed on them.
         * As a result, the multiplication operation performed in order to obtain doVar3 can not be stored into a short.
         * The only way this will succeed is if the result of the operation (int) is type cast into a short.
         */
        short doVar1 = 10;
        short doVar2 = 3;
        short doVar3 = (short) (doVar1 * doVar2);
        System.out.println("doVar3: " + doVar3);

        //Compound Assignment Operations
        int xVal = 5;
        long yVal = 10;
        xVal = (int)(xVal * yVal);      //Requires the result to be cast into int, otherwise throws a compilation err.
        xVal *= yVal;                   //Automatically casts the resultant operation into an int (although lossy)
        System.out.println("xVal: " + xVal);
        System.out.println("yVal: " + yVal);

        /*
         * Example
         * Step 1: xLong is assigned a value of 5
         * Step 2: xLong is assigned a value of 3
         * Step 3: yLong is assigned a value of 3 using value of xLong.
         */
        long xLong = 5;
        long yLong = (xLong = 3);
        System.out.println("xLong: " + xLong);
        System.out.println("yLong: " + yLong);
    }
}
