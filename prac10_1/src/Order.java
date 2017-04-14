/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Order {

    public double totalPrice = 0.0; // Default price for order

    public double addShirt(Shirt shirt) {
        totalPrice = totalPrice + shirt.price;
        return totalPrice;
    }
} // end of class
