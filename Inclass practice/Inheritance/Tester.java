public class Tester
{
   public static void main(String [] args)
   {
   
   Student one = new Student();
   Student two = new Student ("Stu Steiner", 666);
   Student three = new Undergrad();
   Student four = new Undergrad("Jake Fylnn", 888, 2016);

   
   System.out.println(one);
   System.out.println(two);
   System.out.println(three);
   System.out.println(four);
   
      }


}