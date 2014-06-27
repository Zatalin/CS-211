public class Item implements Comparable<Item> 
{

   private String upc;
   protected String desc;
   
   private Item(){}
   
   public Item(String u,  String d) 
   {
      this.upc = u;
      this.desc = u;
   }//End EVC
   
   @Override
   public String toString()
   {
      return this.upc + " _ " + this.desc;
   }//end toString

   @Override
   public int compareTo(Item pi) 
   {
      return this.upc.compareTo(pi.upc);
   }

   public String getUPT() {return this.upc;}
   public String getDesc() {return this.desc;}

}//end class Item