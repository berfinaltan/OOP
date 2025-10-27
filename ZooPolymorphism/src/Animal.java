package org.example;

public abstract class Animal {
    private double weight;
    private int age;
    private String species;

    // Getter & Setter
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Abstract methods (her hayvan türü kendine özgü şekilde tanımlar)
    public abstract double getDosage();
    public abstract double getFeedSchedule();
}
