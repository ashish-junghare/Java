import java.lang.*;

class Arithmetic
{
   public boolean CheckEven(int iNo)
   {
      if(iNo%2==0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}


class program23
{
   public static void main(String arg[])
   {
      boolean bRet = false;
      
      Arithmetic obj = new Arithmetic();
      bRet=obj.CheckEven(400);
      if(bRet==true)
      {
         System.out.println("It is Even number\n");
      }
      else
      {
         System.out.println("It is odd number\n");
      }
   }
}