import java.lang.*;
import java.util.*;


class pattern
{
	private int iRow,iCol;
	
	public pattern(int a,int b)
	{
		this.iRow=a;
		this.iCol=b;
	}
	public void DisplayPattern()
	{
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print("*\t");
			}
			System.out.print("\n");
		}
	}
}
class program150
{
	public static void main(String arg[])
	{
		pattern obj=new pattern(4,4);
		obj.DisplayPattern();
	}

}