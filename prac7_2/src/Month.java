/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class Month {
    public int monthNumber;
    public void displayMonth(){
        switch(monthNumber){
            case 1:
                System.out.println("一月");
                break;
            case 2:
                System.out.println("二月");
                break;
            case 3:
                System.out.println("三月");
                break;
            case 4:
                System.out.println("四月");
                break;
            case 5:
                System.out.println("五月");
                break;
            case 6:
                System.out.println("六月");
                break;
            case 7:
                System.out.println("七月");
                break;
            case 8:
                System.out.println("八月");
                break;
            case 9:
                System.out.println("九月");
                break;
            case 10:
                System.out.println("十月");
                break;
            case 11:
                System.out.println("十一月");
                break;
            case 12:
                System.out.println("十二月");
                break;
            default:
                System.out.println("錯誤");
        } // end of switch
    }
}
