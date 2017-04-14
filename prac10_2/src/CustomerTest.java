/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class CustomerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Customer c1 = new Customer(),
                c2 = new Customer();
        c1.setCustomerInfo(1, "Harry", "234 Maple St", "505-123-4545");
        c2.setCustomerInfo(2, "Sally", "567 Oak St", "505-123-2323",
                "sally@gmail.com");
        c1.display();
        c2.display();
    }

}
