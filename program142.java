import java.lang.*;
import java.util.*;

class ArrayX
{
	private int Arr[];
	
	public ArrayX(int iNo)
	{
		Arr=new int[iNo];
	}
	public void Accept()
	{
		int iCnt=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter values: ");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobj.nextInt();
		}

	}
	public void Display()
	{
		System.out.println("Entered values are: ");

		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
		
	}

	public int Summation()
		{	
			int iSum=0,i=0;

			for(i=0;i<Arr.length;i++)
			{
				iSum=iSum+Arr[i];
			}
			return iSum;

		}

} 



class program142
{
	public static void main(String arg[])
	{
		int iRet=0;
		int iLength=0;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter value for constructor: ");
		iLength=sobj.nextInt();
		ArrayX aobj=new ArrayX(iLength);
		aobj.Accept();
		aobj.Display();
		iRet=aobj.Summation();
		System.out.println("Summation is: "+iRet);
		aobj=null;
	}

}

