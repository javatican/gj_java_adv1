
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryannieh
 */
public class NameListTwo {
    public ArrayList theList;

    public void setList() {
        theList = new ArrayList();
        theList.add("Joe Smith");
        theList.add("Mary Palmer");
        theList.add("Jose Gonzales");
        theList.add("Linda Baker");
        System.out.println("Names list: " + theList);
        System.out.println("Size of ArrayList: " + theList.size());
    }

    public void manipulateList() {
        theList.remove("Joe Smith");
        System.out.println("Names list after removing element: " + theList);
        System.out.println("Size of ArrayList: " + theList.size());
        theList.add(1, "Joe Smith");

        System.out.println("Names list after adding element: " + theList);
        System.out.println("Size of ArrayList: " + theList.size());

    }
    
    public void displayNames(){
        System.out.println("Names in the ArrayList:");
        for(Object name : theList){
            System.out.println(name);
        }
    }
}
