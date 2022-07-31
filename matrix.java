package MarvellousMatrix;
import java.io.*;
import java.util.*;

public class matrix
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