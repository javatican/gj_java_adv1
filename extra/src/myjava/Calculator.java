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
public class Calculator {

    public static int sum(int numberOne, int numberTwo) {
        System.out.println("Method One");
        return numberOne + numberTwo;
    }

    public static float sum(float numberOne, float numberTwo) {
        System.out.println("Method Two");
        return numberOne + numberTwo;
    }

    public static float sum(int numberOne, float numberTwo) {
        System.out.println("Method Three");
        return numberOne + numberTwo;
    }
}
