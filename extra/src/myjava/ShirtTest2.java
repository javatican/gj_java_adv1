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
public class ShirtTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt2 myshirt;
        myshirt = new Shirt2();
        myshirt.displayInformation(); 
        myshirt = new Shirt2('R', 1000);
        myshirt.displayInformation();
    }

}
