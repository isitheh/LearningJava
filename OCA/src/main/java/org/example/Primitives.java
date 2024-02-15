package org.example;

import java.util.Date;

/*
 * @Author: Sithembiso Sithole
 */
public class Primitives {
    int num = 10; //Java allocates in memory, 32 bits [Range 2^23 - signed]

    Primitives() {
        //Minimum and Maximum int value can be found in Java as below:
        System.out.println(Integer.MAX_VALUE);

        //Specify the literal to be specific with numerals
        long longNum = 2147483648L;

        System.out.println(56);     //Base 10 number prints 56
        System.out.println(0xb11);  //Binary representation prints 3
        System.out.println(017);    //Octal representation prints 15 = ((7 * (8 ^ 0)) + (1 * (8 ^ 1)))
        System.out.println(0x1F);   //Hexadecimal representation prints 31 = 00011111 = 11111 = 16 + 8 + 4 + 2 + 1

        int aMilli = 1_000_000;
        System.out.println("Print a million: " + aMilli);

        //double invalidVar = _1000.00; or _1000.00; 1_.01; //Doesn't compile
        Date mDate;     //mDate is a reference variable
        mDate = new Date();     //The reference is assigned to the object and now points to a date object.
        System.out.println("Date instance is: " + mDate.getTime());

        //mDate = null;   //The compiler allows a null to be assigned to a reference type.
        //aMilli = null;   //Primitive type will not compile when assigned to null
    }
}
