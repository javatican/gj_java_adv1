/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Customer {
    public int customerID = 0; // Default ID for a customer
    public char status = 'N'; // Default status for a customer
    public double totalPurchases = 0.0; // Default totalPurchases for a customer

    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + customerID); 
        System.out.println("Customer Status: " + status); 
        System.out.println("Customer totalPurchase: " + totalPurchases); 
        
    }
}
