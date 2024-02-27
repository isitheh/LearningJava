package org.example.chapter3;

/*
 * @Author: Sithembiso Sithole
 */
public class MutableClass {
    private String s;

    /*
     * Constructor
     */
    public MutableClass() {}

    public String getS() {
        return s;
    }

    /*
     * Providing a setter function to the class makes it mutable.
     * Since the variables in this class can be set or changed.
     */
    public void setS(String s) {
        this.s = s;
    }
}
