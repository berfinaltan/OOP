package org.example;

public class Rodent extends Animal {

    @Override
    public double getDosage() {
        return getWeight() * 0.08;  // Kemirgenler için ilaç dozu
    }

    @Override
    public double getFeedSchedule() {
        return (getAge() * getWeight()) * 0.01;  // Kemirgenler için yemleme planı
    }
}
