package org.example.transport;

/*
 * @Author: Sithembiso Sithole
 */
public class Car {
    //Variables
    String make;
    int maxSpeed;

    //Instance initializer block is executed first at run time before the constructor.
    {
        System.out.println("instance initializer block invoked");
    }

    /*
     * This is a constructor for type Car.
     * Note: No return type. Constructor name matches class name
     */
    public Car() {
        System.out.println("This is a constructor for type Car.");
    }

    /*
     * This is not a constructor for type Car.
     * Note: This has a return type although class name and method name is a match.
     */
    public void Car() {
        System.out.println("This is not a constructor for type Car.");
    }

    //Methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
