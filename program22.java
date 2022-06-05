import java.lang.*;

class Arithmetic
{
   public int iCnt;

   public Arithmetic()
   {
      iCnt=0;
   }
   
   public int Summation(int iNo)
   {
      int iSum=0;
      for(iCnt=1;iCnt<=iNo;iCnt++)
      {
         iSum=iSum+iCnt;
      }
   
   return iSum;
   }
}

class program22
{
   public static void main(String arg[])
   {
      int iRet=0;
      Arithmetic obj=new Arithmetic();
      iRet=obj.Summation(4);
      System.out.println(iRet);

   }

}