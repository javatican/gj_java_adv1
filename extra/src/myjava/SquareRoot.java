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
public class SquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float square = 4;
        // number to find sq root of
        float squareRoot = square;
        // first guess
        while (squareRoot * squareRoot - square > 0.001) { // How accurate?
            squareRoot = (squareRoot + square / squareRoot) / 2;
            System.out.println("Next try will be " + squareRoot);
        }
        System.out.println("Square root of " + square + " is " + squareRoot);
    }

}
