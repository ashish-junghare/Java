import MarvellousMatrix.matrix;
import java.util.*;

class program331
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