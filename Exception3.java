import java.lang.*;
import java.util.*;

class Demo
{
    public int Division(int no1,int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}

class Exception3
{
    public static void main(String arg[])
    {
        int ret=0;
        int Arr[]={10,20,30,40,50};
        Scanner sobj=new Scanner(System.in);
        Demo dobj=new Demo();
        
        System.out.println("Enter the first number : ");
        int no1=sobj.nextInt();

        System.out.println("Enter the second number : ");
        int no2=sobj.nextInt();
        try
        {
            ret=dobj.Division(no1,no2);
            System.out.println("Division is: "+ret);
        
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch");

        }
        

    }
}