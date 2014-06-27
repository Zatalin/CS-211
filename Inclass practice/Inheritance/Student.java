public class Student
{
   private String name;
   protected int id;
   
   public Student()
   {
      this.name = "Ima Nerd";
      this.id = 12345;
         
   }//end Student()
   
   public Student(String n, int i)
   {
      this.name = n;
      this.id = i;
   }//End student
   
   public String toString() 
   {
      return "Name:" + this.name + " ID:" + this.id;
   
   }//end tostring
   
}//end student class