package org.example;

/*
 * @Author: Sithembiso Sithole
 */
public class Animal {
    //Attributes - Variable
    String name;
    String species;

    //Behaviours - Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void sound() {
        System.out.println("The sound an animal makes.");
    }
}
