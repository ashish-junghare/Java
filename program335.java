import MarvellousMatrix.matrix;
import java.util.*;


class MYMatrix extends matrix
{
	public MYMatrix(int a,int b)
	{
		super(a,b);
	}
	public void SwapCol()
	{
		int iTemp=0;
		for(int j=0;j<iCol-1;j+=2)		//handling corner cases
		{
			for(int i=0;i<iRow;i++)
			{
				iTemp=Arr[i][j];
				Arr[i][j]=Arr[i][j+1];
				Arr[i][j+1]=iTemp;
			}
		}
	}
}

class program335
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

		lobj.SwapCol();
		System.out.println("Data after swapping is: ");
		lobj.display();
	}
}