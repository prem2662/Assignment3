
public class BuyBroom implements Command
{
   private BroomStock BroomStock;

   public BuyBroom(BroomStock BroomStock){
      this.BroomStock = BroomStock;
   }

   public void execute() {
      BroomStock.buy();
   }
}

