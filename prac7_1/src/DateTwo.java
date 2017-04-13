/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class DateTwo {

    public int dayNumber;

    public void displayDay() {
        if (dayNumber == 1) {
            System.out.println("星期一");
        } else if (dayNumber == 2) {
            System.out.println("星期二");
        } else if (dayNumber == 3) {
            System.out.println("星期三");
        } else if (dayNumber == 4) {
            System.out.println("星期四");
        } else if (dayNumber == 5) {
            System.out.println("星期五");
        } else if (dayNumber == 6) {
            System.out.println("星期六");
        } else if (dayNumber == 7) {
            System.out.println("星期日");
        } else {
            System.out.println("錯誤");
        }
    }
}
