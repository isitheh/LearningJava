package org.example.chapter3;

public class ImmutableClass {
    private String s;
    /*
     * Constructor
     */
    public ImmutableClass() {}

    /*
     * Only get method. No set method makes the class immutable
     */

    public String getS() {
        return s;
    }
}
