import java.lang.*;
import java.lang.module.ResolutionException;
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

class Searching extends Array
{
	public Searching(int iSize)
	{
		super(iSize);
	}

	public int BiDirectionSearch(int iNo)
	{
		int iStart=0;
		int iEnd=(Arr.length)-1;
		int iPos=-1;
		while(iStart <= iEnd)
        {
            if(Arr[iStart] == iNo)
            {
                iPos = iStart;
                break;
            }
            if(Arr[iEnd] == iNo)
            {
                iPos = iEnd;
                break;
            }
            iStart++;
            iEnd--;
        }
        return iPos;
	}

	public int LinearSearch(int iNo)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return -1;
		}
		else
		{
			return i;
		}

	}
}


class program373
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size for Array: ");
		int size=sobj.nextInt();

		Searching aobj=new Searching(size);
		aobj.Acceppt();
		aobj.Display();

		System.out.println("Enter element to search: ");
		int iValue=sobj.nextInt();

		int iRet=aobj.LinearSearch(iValue);
		if(iRet==-1)
		{
			System.out.println("There is no such element");
		}
		else
		{
			System.out.println("Element in array at index: "+iRet);
		}
		int iRet1=aobj.BiDirectionSearch(iValue);
		if(iRet1==-1)
		{
			System.out.println("There is no such element");
		}
		else
		{
			System.out.println("Element in array at index: "+iRet1);
		}
	}
}