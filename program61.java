//Check whether number is armstrong or not

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.*;
import java.lang.annotation.IncompleteAnnotationException;


class Armstrong
{
   public boolean ChkArmstrong(int iNo)
   {
      int iTemp=0,iCnt=0,i=0,iDigit=0;
      int iSum=0;
      
      if(iNo<0)
      {
         iNo=-iNo;
      }
      iTemp=iNo;
      while(iNo!=0)
      {
         iCnt++;
         iNo=iNo/10;
      }
      iNo=iTemp;
      while(iNo!=0)
      {
         int iMult=1;
         iDigit=iNo%10;
         for(i=0;i<iCnt;i++)
         {
            iMult=iMult*iDigit;
         }
         iSum=iSum+iMult;
         iNo=iNo/10;
      }
      if(iSum==iTemp)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}

class program61
{
   public static void main(String arg[])
   {
      InputStreamReader iobj=new InputStreamReader(System.in);
      BufferedReader bobj= new BufferedReader(iobj);

      try
      {
         System.out.println("Enter number to check armstrong number: ");
         int iValue=Integer.parseInt(bobj.readLine());

         Armstrong aobj=new Armstrong();
         boolean bRet=aobj.ChkArmstrong(iValue);
         if (bRet==true)
         {
            System.out.println(iValue+" is armstrong number");
         }
         else
         {
            System.out.println(iValue+" is not armstrong number");
         }

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