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
public class Shirt {

    /**
     * *****************************************
     * Attribute Variable Declaration Section
     *
     ******************************************
     */
    public int shirtID = 0; //Default ID for the shirt
    public String description = "-description required-";
    // The color codes are R=Red, B=Blue, G=Green
    public char colorCode = 'U';
    public double price = 0.0; //Default price for all shirts
    public int quantityInStock = 0;

    public void setPrice(double priceArg) {
        price = priceArg;
    }

    public void displayInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color Code: " + colorCode);
        System.out.println("Shirt price: " + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }

    public static char convertShirtSize(int numericalSize) {
        if (numericalSize < 10) {
            return 'S';
        } else if (numericalSize < 14) {
            return 'M';
        } else if (numericalSize < 18) {
            return 'L';
        } else {
            return 'X';
        }
    }
}
