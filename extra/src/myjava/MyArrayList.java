/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

import java.util.ArrayList;

/**
 *
 * @author ryannieh
 */
public class MyArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList myList;
        myList = new ArrayList();
        myList.add("John");
        myList.add("Ming");
        myList.add("Mary");
        myList.add("Prashant");
        myList.add("Desmond");
        //
        myList.remove(0);
        myList.remove(myList.size() - 1);
        myList.remove("Mary");
        //
        System.out.println(myList);
    }

}
