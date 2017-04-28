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
public class AmountDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int initialSum = 50000;
        int interest = 7;
        int years = 0;
        int currentSum = initialSum;
        while (currentSum <= initialSum*2) {
            currentSum += currentSum * interest / 100;
            years++;
            System.out.println("Year " + years + ": " + currentSum );
        }
    }

}
