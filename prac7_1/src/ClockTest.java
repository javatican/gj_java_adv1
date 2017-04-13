/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class ClockTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock c = new Clock();
        c.currentTime=800; //不能使用0800
        c.displayPartOfDay();
        c.currentTime=1400;
        c.displayPartOfDay();
    }
    
}
