/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class ClassMap {

    public String[][] deskArray;
    public String name;

    public void setClassMap() {
        deskArray = new String[3][4];
    }

    public void setDesk() {
        boolean flag = false;
        lab1:
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (deskArray[row][col] == null) {
                    flag = true;
                    deskArray[row][col] = name;
                    System.out.println(name + " desk is at position : Row:"
                            + row + ", Column:" + col);
                    break lab1;
                }
            }
        }
        if (!flag) {
            System.out.println("All desk occupied.");
        }
    }

    public void displayDeskMap() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(deskArray[row][col] + "\t");
            }
            System.out.println();
        }

    }
}
