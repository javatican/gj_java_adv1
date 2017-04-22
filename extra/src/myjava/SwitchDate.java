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
public class SwitchDate {

    public int month = 1;

    public void calculateNumDays() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("There are 31 days in that month.");
                break;
            case 2:
                System.out.println("There are 28 days in that month.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("There are 30 days in that month.");
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
    }
}
