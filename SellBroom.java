
public class SellBroom implements Command
{
   private BroomStock BroomStock;

   public SellBroom(BroomStock BroomStock){
      this.BroomStock = BroomStock;
   }

   public void execute() {
      BroomStock.sell();
   }
}

