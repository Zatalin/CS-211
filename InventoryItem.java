public class InventoryItem 
{

   protected int quantity;
   protected double price;
   private Item item;
   
   @Override
   public String toString()
   {
      return this.item + " _ " + this.quantity + " , " + this.price + " $" + this.getTotal();
      
   } //end toString
   
   private double getTotal(){ return this.quantity * this.price;}
   
   public int compareTo(InventoryItem pi) 
   {
   
      return this.item.compareTo(pi.item);
   
   }//end Compareto
   
   private InventoryItem(){}
   public InventoryItem(String upc, String desc, int quan, double price) 
   {
   
      this.price = p;
      this.quantity = quan;
      this.item = new Item(upc, desc);
                
   } //End EVC
   
   public Inventory(int quan, double p, Item it) 
   {
   
   this(it.getUPC(), it.getDesc(), quan, p);
   //Why not this.price = p; this.quantity = quan; this.item = it;?
   
   }//End EVC
   public double getPrice() { return this.price;}

}//End InventoryItem