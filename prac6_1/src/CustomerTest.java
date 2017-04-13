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
        Customer cust1, cust2;
        cust1 = new Customer();
        cust2 = new Customer();
        cust1.customerID = 1;
        cust1.name="Mary Smith";
        cust1.email="mary.smith@gmail.com";
        cust1.displayCustomerInfo();
        //
        cust2.customerID = 2;
        cust2.name="Frank Jones";
        cust2.email="frank.jones@gmail.com";
        cust2.displayCustomerInfo();
        //
        cust2 = cust1;
        cust2.displayCustomerInfo();
    }

}
