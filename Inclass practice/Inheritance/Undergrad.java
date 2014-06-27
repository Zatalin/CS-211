public class Undergrad extends Student{

   private int gradYear;
   public Undergrad()
   {
      super("Kyle Rezin", 999);
      this.gradYear = 2015;
  
   }
   public Undergrad(String n, int i, int y)
   {
      super(n, i);
      this.gradYear = y;
   
   }
   @Override
   public String toString()
   {
      return super.toString() + "\nGrad :" + this.gradYear + ""; //"" to make grad year string, super to call rest of the toString
   }


}//End Undergrad class