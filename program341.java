import java.lang.*;
import java.util.*;



class program341
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		char Arr[]=(Integer.toString(sobj.nextInt())).toCharArray();
		
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