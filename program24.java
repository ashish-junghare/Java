import java.lang.*;

class Divisible
{
   
   public boolean Check(int iNo)
   {
      if(
         ((iNo%3)==0) && 
         ((iNo%5)==0)
         )
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}

class program24
{
   public static void main(String arg[])
   {
      boolean bRet=false;
      Arithmetic obj=new Arithmetic();
      bRet=obj.Check();
      if (bRet==true)
      {
         System.out.println("It is divisible by 3 and 5\n");
      }
      else
      {
         System.out.println("It is not divisible by 3 and 5\n");
      }

   }

}