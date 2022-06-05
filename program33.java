// check whether its perfect number or not
import java.lang.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CheckPrfect
{
   public int iCnt=0;
   public int iSum=0;
   
   public boolean ChkPerfect(int iNo)
   {
      for(iCnt=1;((iCnt<=iNo/2) && (iSum<=iNo));iCnt++)
      {
         if((iNo%iCnt)==0)
         {
            iSum+=iCnt;
         }
      }
      if(iSum==iNo)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}

class program33
{
   public static void main(String arg[])
   {
      boolean iRet=false;
      
      InputStreamReader iobj=new InputStreamReader(System.in);
      BufferedReader bobj = new BufferedReader(iobj);

      try
      {
         System.out.println("Enter any value: ");
         int iValue = Integer.parseInt(bobj.readLine());

         CheckPrfect cobj=new CheckPrfect();
         iRet=cobj.ChkPerfect(iValue);

         if(iRet==true)
         {
            System.out.println(iValue+" is a perfect number");
         }
         else
         {
            System.out.println(iValue+" is not perfect number");
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