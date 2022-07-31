import java.lang.*;
import java.util.*;

class Array
{
	public int Arr[];

	public Array(int iSize)
	{
		Arr=new int[iSize];
	}

	protected void finalize()
	{
		Arr=null;
	}

	public void Acceppt()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Elements: ");

		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
	}

	public void Display()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Elements from Array are: ");

		for(int i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		System.out.println();
	}

}



class program372
{
	public static void main(String arg[])
	{
		Array aobj=new Array(3);
		aobj.Acceppt();
		aobj.Display();
	}
}