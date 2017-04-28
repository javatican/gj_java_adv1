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
public class ForInLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ages[] = new int[]{27, 12, 82, 50, 34, 1};
        for (int age : ages) {
            System.out.println("Age is " + age);
        }

    }

}
