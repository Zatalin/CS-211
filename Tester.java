import java.io.*;
import java.util.Scanner;

public class Tester
{

   public static void main(String [] args) throws Exception
   {
      int choice;
      Scanner kb = new Scanner(System.in);
      InventoryItem [] array = null;
      
      array = fillArray(kb);
      
      do
      {
      choice = menu(kb);
      switch(choice)
      {
         case 1;Arrays.sort(array);
            break;
            
         case 2; Array.Sort(array, new PriceSort());
            break; 
            
         default; System.
      }//end Switch
           
      
      }while
      
   public static void printArray(PrintStream out, InventoryItem[] array)
   {
   for(InventoryItem i: array)
      System.out.println(i + "/n");
      
   }//End printArray
   //choice = Integer.parseInt(kb.nextLine()); Good for life
   }//End Main
   
   public static InventoryItem [] fillArray(Scanner kb) throws Exception
   {
   
      File inf = FileUtil.openInputFile(kb);
      Scanner fin = new Scanner(inf);
      int count = FileUtil.countRecords(fin, 1);
      fin.close();
      
      InventoryItem [] array = new InventoryItem[count];
           
      for(int x = 0; x < array.length; x++)
      {
      
         String line = kb.nextLine();
         String [] res = line.split(", ");
         array[x] = new InventoryItem(res[0], res[1], Integer.parseInt(res[2]), Double.parseDouble(res[3]));
      
      
      }//end for loop
      return array;
   }// end something fuck
   
}//End Tester