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
    public String name;
    public String email;

    public void displayCustomerInfo() {
        System.out.println("********Customer Information********");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("************************************");
    }
}
