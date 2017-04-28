package myjava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class TestBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passmark = 60;
        boolean passed = false;
        int[] score = {45,59,34,65,70,23};
        for (int unitScore : score) {
            if (unitScore > passmark) {
                passed = true;
                break;
            }
        }
        System.out.println("是否有及格的分數? " + passed);
    }

}
