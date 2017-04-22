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
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Hello";
        // 字串串接
        s1 = s1 + " World";
        s1 = s1.concat("!");
        System.out.println("s1:" + s1);
        // 字串長度
        System.out.println("s1的長度:" + s1.length());
        // 轉換成小寫
        s1 = s1.toLowerCase();
        System.out.println("s1轉換成小寫字母:" + s1);
        // 轉換成大寫
        s1 = s1.toUpperCase();
        System.out.println("s1轉換成大寫字母:" + s1);
        //取子字串
        String s2 = s1.substring(1, 7);
        System.out.println("s2:" + s2);
        //是否以某個字串結尾
        boolean b1 = s1.endsWith("D!");
        System.out.println("b1:" + b1);
        //去掉頭尾的空白字元
        String s3 = "   123   ";
        s3 = s3.trim();
        System.out.println("trimmed s3:" + s3);
    }

}
