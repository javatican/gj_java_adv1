/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class PersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        p.calculateAge();
        p.ageYears=24;
        p.calculateAge();
        p.ageYears=80;
        p.calculateAge();
    }
    
}
