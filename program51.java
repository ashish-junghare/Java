//To sum of even digits

import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;


class Digit
{
   public int iDigit=0;
   public int iSum=0;
   public int SumEvenDigits(int iNo)
   {
      while(iNo>0)
      {
         iDigit=iNo%10;
         if (iDigit%2==0)
         {
            iSum+=iDigit;
         }
         iNo=iNo/10;
      }
      return iSum;
   }
}


class program51
{
   public static void main(String arg[])
   {
      
      InputStreamReader iobj=new InputStreamReader(System.in);
      BufferedReader bobj = new BufferedReader(iobj);

      try
      {
         int iRet=0;
         System.out.println("Enter any number: ");
         int iValue1 = Integer.parseInt(bobj.readLine());

         Digit dobj=new Digit();

         iRet=dobj.SumEvenDigits(iValue1);
         System.out.println("Sum of even digit is: "+iRet);

      }
      catch(Exception obj)
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

/*

Time complexity : O(N)
where N is number of digits

*/