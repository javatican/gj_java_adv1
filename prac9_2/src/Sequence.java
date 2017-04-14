/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Sequence {

    public int firstNumber = 0;
    public int secondNumber = 1;
    public int nextNumber;
    public final int SEQUENCE_LIMIT = 100;

    public void displaySequence() {
        System.out.print(firstNumber + " " + secondNumber + " ");
        nextNumber = firstNumber + secondNumber;
        while (nextNumber < SEQUENCE_LIMIT) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
    }

}
