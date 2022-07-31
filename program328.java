//reverse at word in string

import java.lang.*;
import java.util.*;
import java.util.Arrays;

import javax.crypto.spec.IvParameterSpec;
import javax.swing.plaf.synth.SynthStyle;

class program327
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows:");
		int irow=sobj.nextInt();
		
		System.out.println("Enter number of columns:");
		int icol=sobj.nextInt();

		int Arr[][]=new int[irow][icol];

		System.out.println("Enter the elements: ");
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
		int iSum=0;

		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j].reverse();
			}
		}
		System.out.println("Addition of diagonal is: "+iSum);

	}


}