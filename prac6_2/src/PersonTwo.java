/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class PersonTwo {

    public StringBuilder name = new StringBuilder(8);
    public StringBuilder phoneNumber = new StringBuilder();

    public void displayPersonInfo() {
        name.append("Fernando");
        name.append(" ");
        name.append("Gonzalez");
        // Display the name object
        System.out.println("Name: " + name.toString());
        // Display the capacity
        System.out.println("Name object capacity: " + name.capacity());
        //
        phoneNumber.append("5551234567");
        phoneNumber.insert(3, "-");
        phoneNumber.insert(7, "-");
        System.out.println("Phone number: " + phoneNumber.toString());
        System.out.println("First name: "+ name.substring(0,8));
    }
}
