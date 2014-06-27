import java.util.*;
import java.io.*;
public class FileUtil 
{
   
   public static int countRecords(Scanner fin, int total) 
   {
   
      int count = 0;
      while (fin.hasNext())
      {
   
      fin.nextLine();
      count ++;
      
      } //End while
   
   return count / total;   
   }//end Count
   public static File openInputFile(Scanner kb) 
   {
   
      File inf = null;
      String name = "";
      do
      {
         System.out.print("Please enter the filename ");
         name = kb.nextLine();
         name = name.trim(); //cleans spaces at the beggninning and end of string
         inf = new File(name);
  
      }//End do
  
      while (!inf.exists());
      return inf;
  
   } //end openInputFile


}//End fileUtil