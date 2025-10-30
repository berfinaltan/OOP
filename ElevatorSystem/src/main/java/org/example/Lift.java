package org.example;

public class Lift {
    public int floor;
    public int elevatorPassenger;
    public boolean goingUp = true;
    public boolean hasRequest = true;

    public boolean doorOpen;
    public boolean floorIndicator;
    public boolean controlPanelActive;
    public boolean doorOpenButton;
    public boolean emergencyButton;
    public int targetFloor;

    public void getFloor() {
        if (hasRequest) {
            if (elevatorPassenger <= 6) {
                if (goingUp) {
                    for (int i = floor; i <= 12; i++) {
                        floor = i;
                        System.out.println("The Floor is " + floor + " Going Up");
                    }
                } else {
                    for (int i = floor; i >= 0; i--) {
                        floor = i;
                        System.out.println("The Floor is " + floor + " Going Down");
                    }
                }
            } else {
                System.out.println("The lift cannot handle the weight!!");
            }
        } else {
            System.out.println("Elevator is idle to save energy.");
        }
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setElevatorPassenger(int elevatorPassenger) {
        this.elevatorPassenger = elevatorPassenger;
    }

    public void controlPanel(){
        if(controlPanelActive){
            System.out.println("ControlPanel is active");

            if(doorOpenButton){
                doorOpenButton = true;
                System.out.println("The door is opening...");
            }
            else{
                doorOpenButton = false;
                System.out.println("The door is closing...");
            }


            if(emergencyButton){
                System.out.println("The alarm activated!");
            }
        }
        else {
            System.out.println("Control panel is off. Elevator cannot open");
        }
    }







}


