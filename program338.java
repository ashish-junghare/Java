import java.lang.*;
import java.util.*;



class program338
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter string: ");
		String str=sobj.nextLine();

		char Arr[]=str.toCharArray();

		for(i=0;i<Arr.length-1;i++)
		{
			for(j=0;j<=i;j++)
			{
				
				System.out.print(Arr[j]+"\t");				
			}
			System.out.println();
		}

		for(i=Arr.length-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				
				System.out.print(Arr[j]+"\t");				
			}
			System.out.println();
		}
	}
}