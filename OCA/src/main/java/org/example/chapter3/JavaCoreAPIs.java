package org.example.chapter3;

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

    public void concatenation() {
        /*
         * Rules regarding string concatenation:
         * Rule 1: If all the operands joined by + are numeric, the operation is an addition, result is numeric.
         * Rule 2: If any of the operands joined by the + is a String, the operation is concatenation, result is string.
         * Rule 3: The expression is always evaluated from left to right.
         */
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
}
