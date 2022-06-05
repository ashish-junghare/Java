//Factorial
import java.lang.*;
import java.util.*;

class Number
{
	private int iNo;

	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number: ");
		this.iNo=sobj.nextInt();
	}

	public void Display()
	{
		System.out.println("your number is: "+iNo);
	}

	public int Factorial()
	{
		int iFact=1,i=0;
		for(i=1;i<=iNo;i++)
		{
			iFact=iFact*i;
		}
		return iFact;
	}

} 



class program141
{
	public static void main(String arg[])
	{
		int iRet=0;
		Number nobj=new Number();
		nobj.Accept();
		nobj.Display();
		iRet=nobj.Factorial();
		System.out.println("Factorial is: "+iRet+"\n");

		Number nobj1=new Number();
		nobj1.Accept();
		nobj1.Display();
		iRet=nobj1.Factorial();
		System.out.println("Factorial is: "+iRet+"\n");

	}

}

