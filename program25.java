
/*
35 = fail
50 = pass
60 = second
70 = first
70+ = Distinc 
*/

import java.lang.*;


class Display
{
   public void DisplayPass(float fMarks)
   {
      if(
         (fMarks<0.0) &&
         (fMarks>35.0)
         )
         {
            System.out.println("You are fail\n");
         }
      else if(
         (fMarks<50.0) &&
         (fMarks>=35.0)
         )
         {
            System.out.println("You are in pass class\n");
         }

      else if(
         (fMarks<60.0) &&
         (fMarks>=50.0)
         )
         {
            System.out.println("You are in second class\n");
         }
      else if(
         (fMarks>=60.0) &&
         (fMarks<70.0)
         )
         {
            System.out.println("You are in first class\n");
         }
      
      else if(
         (fMarks>=70.0) &&
         (fMarks<100.0)
         )
         {
            System.out.println("You are in first class with distinction\n");
         }
      else
      {
         System.out.println("Invalid input\n");
      }
   }
}



class program25
{
   public static void main(String arg[])
   {
      Display obj = new Display();
      obj.DisplayPass(60);
   }
}