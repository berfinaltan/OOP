package org.example;

public class People {
    public int currentFloor;
    public int destinationFloor;
    public boolean pressedButton;

    public People(int currentFloor, int destinationFloor, boolean pressedButton) {
        this.currentFloor = currentFloor;
        this.destinationFloor = destinationFloor;
        this.pressedButton = pressedButton;
    }
    public void calledLift(Building building,int floor){
        System.out.println("The elevator has arrived at floor " + floor);

        building.pressCallButton(0);

        building.ringBell(floor);



    }


}
