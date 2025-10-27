package org.example;

public class Horse extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.02;  // Atlar için ilaç dozu formülü
    }

    @Override
    public double getFeedSchedule() {
        return (getAge() * getWeight()) * 0.09; // Atlar için yemleme planı
    }
}
