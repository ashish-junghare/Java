//Pallindrome

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;


class Pallindrome
{

   public boolean ChkPallindrome(int iNo)
   {
      int iDigit=0;
      int iRev=0;
      int iCopy=0;
      if(iNo<0)
      {
         iNo=-iNo;
      }
      iCopy=iNo;
      while(iNo>0)
      {
         iDigit=iNo%10;
         iRev=iRev*10+iDigit;
         iNo=iNo/10;
      }
      if(iCopy==iRev)
      {
         return true;
      }
      else
      {
         return false;
      }

   }
}



class program54
{
   public static void main(String arg[])
   {
      InputStreamReader iobj=new InputStreamReader(System.in);
      BufferedReader bobj = new BufferedReader(iobj);

      try
      {
         boolean bRet=false;

         System.out.println("Enter any number: ");
         int iValue=Integer.parseInt(bobj.readLine());

         Pallindrome pobj=new Pallindrome();
         bRet=pobj.ChkPallindrome(iValue);
         if(bRet==true)
         {
            System.out.println(iValue+" is pallindrome number");
         }
         else
         {
            System.out.println(iValue+" is not pallindrome number");
         }
      }
      catch(Exception obj)
      {
         System.out.println("Exception occur");
      }
      finally
      {
         iobj=null;
         bobj=null;
      }
   }

}

/*

Time complexity : O(N)
where N is number of digits

*/