package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Lift lift = new Lift();
        Building building = new Building();
        People person = new People(3,8,true);


        person.calledLift(building, person.currentFloor);
        lift.setFloor(5);
        lift.setElevatorPassenger(5);

        lift.getFloor();
        lift.hasRequest = true;

        building.ringBell(person.currentFloor);
        System.out.println("Door is opening..");

        lift.setFloor(person.destinationFloor);
        lift.getFloor();

        building.ringBell(person.destinationFloor);
        System.out.println("Person exits");

        lift.controlPanelActive = true;
        lift.doorOpenButton = true;
        lift.emergencyButton = true;


        lift.controlPanel();
        building.ringBell(lift.floor);



        }
    }
