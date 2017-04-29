/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author ryannieh
 */
public class Elevator3 {

    public boolean doorOpen = false; // Default setting
    public int currentFloor = 1; // Default starting point
    public final int TOP_FLOOR = 10;
    public final int MIN_FLOORS = 1;

    public void openDoor() {
        if (!checkDoorStatus()) {
            System.out.println("Opening door.");
            doorOpen = true;
            System.out.println("Door is open.");
        }
    }

    public void closeDoor() {
        System.out.println("Closing door.");
        doorOpen = false;
        System.out.println("Door is closed.");
    }

    public void goUp() {
        System.out.println("Going up one floor.");
        currentFloor++;
        System.out.println("Floor: " + currentFloor);
    }

    public void goDown() {
        if (currentFloor == MIN_FLOORS) {
            System.out.println("不能再下去了!");
        } else if (!doorOpen) {
            System.out.println("Going down one floor.");
            currentFloor--;
            System.out.println("Floor: " + currentFloor);
        } else {
            System.out.println("先關門再下樓!");
        }
    }

    public void setFloor(int desiredFloor) {
        while (currentFloor != desiredFloor) {
            if (currentFloor < desiredFloor) {
                goUp();
            } else {
                goDown();
            }
        }
    }

    public boolean checkDoorStatus() {
        return doorOpen;
    }

    public static void main(String[] args) {
        Elevator3 myElevator = new Elevator3();
        boolean isOpen = myElevator.checkDoorStatus();

    }
}
