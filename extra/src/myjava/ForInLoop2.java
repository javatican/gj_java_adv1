package myjava;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class ForInLoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Tom");
        names.add("Helen");
        names.add("Lewis");
        names.add("Ryan");
        for (String name : names) {
            System.out.println("Name is " + name);
        }

    }

}
