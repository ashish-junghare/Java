import java.lang.*;
import java.util.*;



class program340
{
	public static void main(String arg[])
	{
		int i,j=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		char Arr[]=(Integer.toString(sobj.nextInt())).toCharArray();
		
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