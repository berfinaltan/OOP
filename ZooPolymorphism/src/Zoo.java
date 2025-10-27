package org.example;

public class Zoo {
    public static void main(String[] args) {

        Horse horse = new Horse();
        horse.setSpecies("At");
        horse.setWeight(400);
        horse.setAge(5);

        Feline feline = new Feline();
        feline.setSpecies("Kaplan");
        feline.setWeight(850);
        feline.setAge(3);

        Rodent rodent = new Rodent();
        rodent.setSpecies("Kunduz");
        rodent.setWeight(15);
        rodent.setAge(2);

        System.out.println("---- HORSE ----");
        System.out.println("Tür: " + horse.getSpecies());
        System.out.println("İlaç Dozu: " + horse.getDosage());
        System.out.println("Yemleme Planı: " + horse.getFeedSchedule());

        System.out.println("\n---- FELINE ----");
        System.out.println("Tür: " + feline.getSpecies());
        System.out.println("İlaç Dozu: " + feline.getDosage());
        System.out.println("Yemleme Planı: " + feline.getFeedSchedule());

        System.out.println("\n---- RODENT ----");
        System.out.println("Tür: " + rodent.getSpecies());
        System.out.println("İlaç Dozu: " + rodent.getDosage());
        System.out.println("Yemleme Planı: " + rodent.getFeedSchedule());
    }
}
