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
public class TextAnimate2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder(8);
        sb.append("|------");
        for (int i=0; i<6; i++) {
            System.out.println(sb);
            sb.replace(i+1, i+2, "|");
            Thread.sleep(1000);
        }
    }

}
