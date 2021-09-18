
import java.util.ArrayList;
import java.util.List;

public class CommandInvoker
{
    

   
   private List<Command> ol = new ArrayList<Command>(); 

   public void takeOrder(Command command){
      ol.add(command);		
   }

   public void placeOrders(){
   
      for (Command command : ol) {
         command.execute();
      }
      ol.clear();
   }
}

