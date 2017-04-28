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
public class TextAnimate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        for (String i = "|", t = "------";
                i.length() < 7;
                i += "|", t = t.substring(1)) {
            Thread.sleep(1000);
            System.out.println(i + t);
        }
    }

}
