import java.io.*;
import java.util.*;

class matrix
{
	public int iRow;
	public int iCol;
	public int Arr[][];
	Scanner sobj=new Scanner(System.in);
	
	public matrix(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
		Arr=new int[iRow][iCol];
	}
	public void accept()
	{
		System.out.println("Enter number elements: ");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	public void display()
	{
		System.out.println("Enter elements are: ");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	protected void finalize()
	{
		Arr=null;
		System.gc();
	}
}

class program330
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int iRow=sobj.nextInt();

		System.out.println("Enter number of columns: ");
		int iCol=sobj.nextInt();

		matrix mobj=new matrix(iRow,iCol);

		mobj.accept();
		mobj.display();

	}
}