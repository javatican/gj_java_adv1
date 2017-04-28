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
public class NestForLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 4;
        int width = 10;
        for (int rowCount = 0; rowCount < height; rowCount++) {
            for (int colCount = 0; colCount < width; colCount++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
