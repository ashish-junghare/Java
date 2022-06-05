//program to display summation of n number

import java.lang.*;
import java.util.*;

class Number
{
    private int iNo;

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        this.iNo = sobj.nextInt();
    }

    public void Display()
    {
        System.out.println("Value is : "+this.iNo);
    }

    public int Summation()
    {
        int iSum=0,iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            iSum=iSum+iCnt;
        }
        return iSum;
    }
}

class Program22
{
    public static void main(String b[])
    {
        int iRet=0;
        Number nobj = new Number();

        nobj.Accept();
        nobj.Display();

        iRet=nobj.Summation();
        System.out.println("Summation is: "+iRet);
    }
}