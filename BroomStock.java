
/**
 * Write a description of class BroomStock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BroomStock
{
    // instance variables - replace the example below with your own
   private String productname = "Brooms";
   private int remainingquantity = 10;

   public void buy(){
      remainingquantity++;
      System.out.println("Product New Stock added");
      System.out.println("[ Product: "+productname+",Quantity: " + remainingquantity +" ] bought");
   }
   public void sell(){
      remainingquantity--;
      System.out.println("Product Sold");
       System.out.println("[ Product: "+productname+",Quantity: " + remainingquantity +" ] sold");
   }
}
