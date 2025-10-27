package org.example;

public class Feline extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.05;  // Kedigiller için ilaç dozu
    }

    @Override
    public double getFeedSchedule() {
        return (getAge() * getWeight()) * 0.07;  // Kedigiller için yemleme planı
    }
}
