import java.util.*;
public class BroomOrderCommandPattern
{
   
   public static void main(String[] args) {
      BroomStock broomStock = new BroomStock();
      Scanner s = new Scanner(System.in);
      BuyBroom bBroom = new BuyBroom(broomStock);
      SellBroom sBroom = new SellBroom(broomStock);
      String abc ="";
      CommandInvoker ci = new CommandInvoker();
      int i =1;
      
      while (i==1){
      System.out.println("Do u want to (S)ell or (P)urchase broom. Enter S or P: ");  
      abc = s.nextLine();
     
      if(abc.equals("P") ||abc.equals("p"))
      ci.takeOrder(bBroom);
      else if(abc.equals("S") ||abc.equals("s"))
      ci.takeOrder(sBroom);
      else
       System.out.println("Incorrect Option.");
      ci.placeOrders();
      System.out.println("Do u want to continue press (1) else any other number: ");  
       i = s.nextInt();
       abc = s.nextLine();
    }
   }

}
