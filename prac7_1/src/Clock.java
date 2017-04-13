/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Clock {

    public int currentTime;

    public void displayPartOfDay() {
        if (currentTime >= 801 && currentTime <= 1200) {
            System.out.println("早上");
        } else if (currentTime >= 1201 && currentTime <= 1700) {
            System.out.println("下午");
        } else if (currentTime >= 1701 && currentTime <= 2400) {
            System.out.println("晚上");
        } else {
            System.out.println("凌晨");
        }
    }
}
