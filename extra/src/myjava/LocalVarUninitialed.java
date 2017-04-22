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
public class LocalVarUninitialed {

    static int z;
    static boolean b;
    static String s;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        //int y=x; //區域變數x必須先初始化再使用
        System.out.println("z=" + z);
        System.out.println("b=" + b);
        System.out.println("s=" + s);
         
    }

}
