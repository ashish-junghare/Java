import java.lang.*;
import java.util.*;

interface MarvellousSort
{
	public void Accept();
	public void Display();
	public void BubbleSort();
	public void InsertionSort();
	public void SelectionSort();
}

class  Array implements MarvellousSort
{
	public int Arr[];

	public Array(int iSize)
	{
		Arr=new int[iSize];
	}

	public void Accept()
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

	public void BubbleSort()
	{
		int i=0,j=0,temp=0;
		boolean Swap=false;

		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length-i-1;j++)
			{
				Swap=false;
				if(Arr[j]>Arr[j+1])
				{
					temp=Arr[j];
					Arr[j]=Arr[j+1];
					Arr[j+1]=temp;
					Swap=true;
				}
			}

			if(Swap==false)
			{
				break;
			}
		}
	}

	public void InsertionSort()
	{
		int i=0,j=0,selected=0;

		for(i=1;i<Arr.length;i++)
		{
			for(j=i-1,selected=Arr[i];(j>=0)&&(Arr[j]>selected);j--)
			{
				Arr[j+1]=Arr[j];
			}
			Arr[j+1]=selected;
		}

	}

	public void SelectionSort()
	{
		int i=0,j=0,min_index=0,temp=0;
		for(i=0;i<Arr.length-1;i++)
		{
			for(j=i;j<Arr.length;j++)
			{
				min_index=i;
				if(Arr[min_index]>Arr[j])
				{
					min_index=j;
				}
			}
			if(i!=min_index)
			{
				temp=Arr[i];
				Arr[i]=Arr[min_index];
				Arr[min_index]=temp;
			}
	
		}	

	}

}


class program376
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter size for Array: ");
		int size=sobj.nextInt();

		Array aobj=new Array(size);
		aobj.Accept();
		//aobj.Display();

		aobj.BubbleSort();
		System.out.println("");
		System.out.println("Data after sorting after BubbleSort...");
		aobj.Display();

		aobj.SelectionSort();
		System.out.println("");
		System.out.println("Data after sorting after SelectionSort...");
		aobj.Display();

		aobj.InsertionSort();
		System.out.println("");
		System.out.println("Data after sorting after InsertionSort...");
		aobj.Display();

	}
}