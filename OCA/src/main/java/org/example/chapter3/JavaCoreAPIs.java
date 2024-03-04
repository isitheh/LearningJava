package org.example.chapter3;

import java.util.Random;

/*
 * @Author: Sithembiso Sithole
 */
public class JavaCoreAPIs {
    /*
     * Defining Strings
     * Use double quotation marks to create strings.
     * Use single quotation marks to create characters.
     * See the two ways to define a string as below.
     */
    String name1 = "MyName";
    String name2 = new String("MyName"); //New object is created.
    /*
     * In the case of name1 and name2 above, the two strings have
     * different pointers because name2 was created using the new
     * keyword which creates a completely new object.
     */

    public JavaCoreAPIs() {
        System.out.println("Print name1: " + name1);
        System.out.println("Print name2: " + name2);
    }

    /*
     * Rules regarding string concatenation:
     * Rule 1: If all the operands joined by + are numeric, the operation is an addition, result is numeric.
     * Rule 2: If any of the operands joined by the + is a String, the operation is concatenation, result is string.
     * Rule 3: The expression is always evaluated from left to right.
     */
    public void concatenation() {
        int xVal = 1 + 25;
        System.out.println("xVal = " + xVal);
        //int sVal = 1 + "13";        Does not work because string result cannot be stored in an int variable.
        String sVal = 1 + "13" + "J";       //Works because of Rule 2 above.
        System.out.println("Other Val: " + "1" + 25);
        System.out.println("sVal: " + sVal);

        int one = 1;
        int three = 3;
        String four = "4";
        System.out.print("This is interesting, right: ");
        System.out.println(one + 2 + three + four); //Follows Rule 4 above.

        String mString = "1";
        mString += "2";
        mString += 3;
        System.out.println(mString);
    }

    /*
     * This function showcases all the methods relating to the String Type
     */
    public void stringMethods() {
        String mString = "This is a string.";
        /*
         * Method: length
         * Purpose: Indicates the number of characters in a string.
         */
        int mLen = mString.length();
        System.out.println("The length of the string is: " + mLen);

        /*
         * Method: charAt(index)
         * Purpose: Indicates the character at the given index of the string.
         * Support: Generate random integers in range 0 to length of string.
         */
        int mIndex = (new Random()).nextInt(mLen);
        System.out.println("The character at index " + mIndex + " is: " + mString.charAt(mIndex));

        /*
         * Method: indexOf("x")
         * Purpose: Returns the first occurrence of the required character.
         * Support: A char or string can be passed to the overloaded function
         */
        System.out.println("The index of a in our string is: " + mString.indexOf('a'));
        System.out.println("The index of 'is a' in our string is: " + mString.indexOf("is a"));
        //Search for a character 'i' starting from index 6.
        System.out.println("The index of char 'i' from index 6 onwards: " + mString.indexOf('i', 5));
    }
}
