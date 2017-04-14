/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class ClassMapTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClassMap cm = new ClassMap();
        cm.setClassMap();
        cm.name = "Ann";
        cm.setDesk();
        cm.name = "Bond";
        cm.setDesk();
        cm.name = "Cindy";
        cm.setDesk();
        cm.name = "Donald";
        cm.setDesk();
        cm.displayDeskMap();
        //
        cm.name = "Ann";
        cm.searchDesk();
        cm.name = "Tom";
        cm.searchDesk();
    }

}
