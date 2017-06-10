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
public class Shirt2 {

    /**
     * *****************************************
     * Attribute Variable Declaration Section
     *
     ******************************************
     */
    private int shirtID = 0; //Default ID for the shirt
    private String description = "-description required-";
    // The color codes are R=Red, B=Blue, G=Green
    private char colorCode = 'U';
    private double price = 0.0; //Default price for all shirts
    private int quantityInStock = 0;
    
    public Shirt2(){
        
    }
     
    public Shirt2(char colorCode){
        setColorCode(colorCode);
    }

    public Shirt2(char colorCode, double price){
        this(colorCode);
        setPrice(price);
    }
    public void displayInformation() {
        System.out.println("Shirt ID: " + getShirtID());
        System.out.println("Shirt description: " + getDescription());
        System.out.println("Color Code: " + getColorCode());
        System.out.println("Shirt price: " + getPrice());
        System.out.println("Quantity in stock: " + getQuantityInStock());
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

    /**
     * @return the shirtID
     */
    public int getShirtID() {
        return shirtID;
    }

    /**
     * @param shirtID the shirtID to set
     */
    public void setShirtID(int shirtID) {
        this.shirtID = shirtID;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the quantityInStock
     */
    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * @param quantityInStock the quantityInStock to set
     */
    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
}
