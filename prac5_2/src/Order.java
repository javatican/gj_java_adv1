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

    public long orderValue = 0L;
    public int itemQuantity = 10_000_000;
    public int itemPrice = 555_500;

    public void calculateTotal() {
        orderValue =  (long)itemQuantity *  itemPrice;
        System.out.println("Order total: " + orderValue);
    }
}
