import MarvellousMatrix.matrix;
import java.util.*;


class LargeMatrix extends matrix
{
	public LargeMatrix(int a,int b)
	{
		super(a,b);
	}
	public int maximum()
	{
		int iMax=Arr[0][0];
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if(iMax<Arr[i][j])
				{
					iMax=Arr[i][j];
				}
			}

		}
		return iMax;
	}
}

class program332
{
	public static void main(String arg[])
	{
		int iRet=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number of rows: ");
		int iRow=sobj.nextInt();

		System.out.println("Enter number of columns: ");
		int iCol=sobj.nextInt();

		LargeMatrix lobj=new LargeMatrix(iRow,iCol);

		lobj.accept();
		lobj.display();
		iRet=lobj.maximum();
		System.out.println("Maximum number is: "+iRet);

	}
}