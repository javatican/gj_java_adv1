public class ClothingTest {
   
  public static void main (String args[]) {
 
    Shirt myShirt = new Shirt(111, "Casual shirt", 'R', 49.99, 'M');
    processReturns(myShirt);
  } 
  public static void processReturns(Returnable r){
    String msg = r.doReturn();
    System.out.println(msg);
  }
}
