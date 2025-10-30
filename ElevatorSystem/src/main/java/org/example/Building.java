package org.example;

public class Building {
    public int doorNumber = 5;
    public boolean doorBell = false;
    public boolean signalLight = false;
    public boolean[] callButtons = new boolean[3];

    public Building(){
        for ( int i = 0; i < callButtons.length; i++) {
            callButtons[i] = false;
        }

    }
    public void ringBell(int floor){
        doorBell = true;
        System.out.println("Elevator has arrived at floor " + floor);
    }
    public void pressCallButton(int buttonIndex){
        if(buttonIndex >= 0 && buttonIndex < callButtons.length){
            callButtons[buttonIndex] = true;
            System.out.println("Call button" + buttonIndex + "pressed");
        }
        else {
            System.out.println("ınvalid button index");
        }
    }






}
