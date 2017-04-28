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
public class NestedWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "floors"; 
        String guess = "";
        long numTries = 0;
        while (!guess.equals(name.toLowerCase())) {
            guess = "";
            while (guess.length() < name.length()) {
                char asciiChar = (char) (Math.random() * 26 + 97);
                guess = guess + asciiChar;
            }
            numTries++;
        }
        System.out.println(name + " found after " + numTries + " tries!");
    }

}
