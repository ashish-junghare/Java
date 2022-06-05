/*
1=4000
2=8000
5=20000
10=40000
*/



import java.lang.*;



class Jwelwers
{
   public void JwelwersBill(int iGram)
   {
      switch(iGram)
      {
         case 1:
            System.out.println("Your price is 4k");
            break;
         case 2:
            System.out.println("Your price is 8k");
            break;
         case 5:
            System.out.println("Your price is 20k");
            break;
         case 10:
            System.out.println("Your price is 40k");
            break;
         default:
            System.out.println("Invalid input");
      }
   }
}
class program26
{
   public static void main(String arg[])
   {
      Jwelwers obj = new Jwelwers();
      obj.JwelwersBill(10);
   }
}