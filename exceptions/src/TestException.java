
public class TestException {
    public static void main (String args[]) {

        TestArray myTestArray = new TestArray(5);
        
        myTestArray.addElement(5, 23);
        
        System.out.println("Finished!"); //never run 
           
    }

}
