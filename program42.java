import java.lang.*;
import java.text.ParsePosition;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChkPrime
{
   public int iCnt=0;
   public int iFactCnt=0;
   public boolean CheckPrime(int iNo)
   {
      for(iCnt=2;iCnt<iNo;iCnt++)
      {
         if((iNo%iCnt)==0)
         {
            iFactCnt++;
         }
      }
      if(iFactCnt==0)
      {
         return true;
      }
      else
      {
         return false;
      }
      
   }

}

class program42
{
   public static void main(String arg[])
   {
      InputStreamReader iobj=new InputStreamReader(System.in);
      BufferedReader bobj = new BufferedReader(iobj);

      try
      {
         boolean bRet=false;
         System.out.println("Enter any number: ");
         int iValue = Integer.parseInt(bobj.readLine());

         ChkPrime cobj=new ChkPrime();
         bRet=cobj.CheckPrime(iValue);
         if(bRet==true)
         {
            System.out.println(iValue+" is prime number");
         }
         else
         {
            System.out.println(iValue+" is not prime number");
         }


      }
      catch(IOException obj)
      {
         System.out.println("Exception occurs");
      }
      finally
      {
         iobj=null;
         bobj=null;
      }

   }
}