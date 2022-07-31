import MarvellousMatrix.matrix;
import java.util.*;


class MYMatrix extends matrix
{
	public MYMatrix(int a,int b)
	{
		super(a,b);
	}
	public void SwapRow()
	{
		int iTemp=0;
		for(int i=0;i<iRow-1;i+=2)		//handling corner cases
		{
			for(int j=0;j<iCol;j++)
			{
				iTemp=Arr[i][j];
				Arr[i][j]=Arr[i+1][j];
				Arr[i+1][j]=iTemp;
			}
		}
	}
}

class program334
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int iRow=sobj.nextInt();

		System.out.println("Enter number of columns: ");
		int iCol=sobj.nextInt();

		MYMatrix lobj=new MYMatrix(iRow,iCol);

		lobj.accept();
		lobj.display();

		lobj.SwapRow();
		System.out.println("Data after swapping is: ");
		lobj.display();
	}
}