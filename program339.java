import java.lang.*;
import java.util.*;



class program339
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		int iNo=sobj.nextInt();

		String str=Integer.toString(iNo);
		char Arr[]=str.toCharArray();
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=0;j<Arr.length;j++)
			{
				
				System.out.print(Arr[j]+"\t");				
			}
			System.out.println();
		}

		
	}
}