public class ClothingTest {
   
  public static void main (String args[]) {
      
    Shirt myShirt = new Shirt(111, "Casual shirt", 'R', 49.99, 'M');
    Clothing clothingItem1 = new Shirt(112, "Polo Shirt", 'G', 39.99, 'L');
    purchase(myShirt);
    purchase(clothingItem1);
    //
    char fit = myShirt.getFit();
    //clothingItem1.getFit();
    ((Shirt)clothingItem1).getFit();
    //
    myShirt.display();
    clothingItem1.display();
  } 
  
  //
  public static void purchase(Clothing c){
      double price = c.getPrice();
      System.out.println("The item price is "+ price);
  }
}
