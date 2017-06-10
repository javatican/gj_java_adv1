/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

public class TestToString {

    public static void main(String[] args) {

        // Output an Object to the console
        System.out.println(new Object());

        // Output this StringBuilder object to the console
        System.out.println(new StringBuilder("Some text for StringBuilder"));

        //Output a class that does not override the toString() method
        System.out.println(new First());

        //Output a class that *does* override the toString() method
        System.out.println(new Second());

    }
}

class Second {

    public String toString() {
        return "This class named Second has overridden the toString() method of Object";
    }

}

class First{}