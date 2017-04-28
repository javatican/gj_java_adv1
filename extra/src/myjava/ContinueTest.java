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
public class ContinueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passMark = 60;
        int passCount = 0;
        int[] score = {45,59,34,65,70,23};
        for (int unitScore : score) {
            if (unitScore < passMark) {
                continue;
            }
            passCount++;
        }
        System.out.println("及格的成績共有 " + passCount+" 科.");
    }

}
