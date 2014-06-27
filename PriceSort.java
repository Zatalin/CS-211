import java.util.Comparator;

public class PriceSort implements Comparator<InventoryItem>
{

   public int compare(InventoryItem o1, InventoryItem o2)
   {
      int res = ((int)(o1.getPrice() * 100)) - ((int)o2.getPrice() * 100);
      return res;

   }


}//end priceSort 