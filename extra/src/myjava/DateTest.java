/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;

/**
 *
 * @author ryannieh
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Month mon = new Month();
        SwitchDate mon = new SwitchDate();
        mon.month = 3;
        mon.calculateNumDays();
        mon.month = 9;
        mon.calculateNumDays();
        mon.month = 2;
        mon.calculateNumDays();
    }
    
}
