/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Counter {

    public final int MAX_COUNT = 100;

    public void displayCount() {
        for (int i = 1; i <= MAX_COUNT; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
