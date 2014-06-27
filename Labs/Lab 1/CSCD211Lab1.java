import java.io.*;
import java.util.*;

public class CSCD211Lab1
{
   private static final int TEAMS = 32;
   
	public static void main(String [] args)throws Exception
	{
		int choice;
		Scanner kb = new Scanner(System.in);
      
      Team [] worldCupTeams = null;
            
      worldCupTeams = fillTeamsArray(kb);
		
		do
		{
			choice = menu(kb);
			executeChoice(choice, worldCupTeams);

		}while (choice != 8);

	}// end main

	public static Team [] fillTeamsArray(Scanner kb)throws Exception
	{      
      return null;     

	}// end fillTeamArray
   
   public static Player [] readPlayers(String filename)throws Exception
   {
      System.out.println("File name:");
      Scanner kb = new Scanner(System.in);
      File inf = FileUtil.openInputFile(kb);
      Scanner fin = new Scanner(inf);
      int count = FileUtil.countRecords(fin, 1);
      fin.close();
      Player [] array = new Player[count];
      for(int x = 0; x < array.length; x++)
      {
         String line = kb.nextLine();
         String [] res = line.split(", ");
         array[x] = new Player();
      
      }//end for loop
     
      return array;
   
      
   }// end readPlayers

	public static int menu(Scanner kb)
	{
		/*
		1.	Print all Teams to the screen
		2.	Print all Teams to the User Specified file
		3.	Sort the Teams by “Natural Order” (Hint: compareTo)
		4.	Sort the by Team Country Name (Hint: Comparator)
		5.	Sort each Team's Players by Number (Hint: Player compareTo)
		6.	Sort each Team's Players by Position (Hint: Comparator)
		7.	Print a entire team and only that team to a user specified file
		8.	Quit
		*/
   	return 8;

	}// end menu

	public static void executeChoice(int choice, Team [] array)throws Exception
	{
                  
     
	}// end executeChoice
   
   public static void printArray(PrintStream out, Team [] array)
   {
         
   }// end printArray

}// end class