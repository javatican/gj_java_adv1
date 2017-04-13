/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Temperature {

    public float fahrenheitTemp = 78.9F;

    public void calculateCelsius() {
        System.out.println((fahrenheitTemp - 32) * 5 / 9);
    }
}
