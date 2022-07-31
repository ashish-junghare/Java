//find max word in string

import java.lang.*;
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;

class program306
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sobj.nextLine();

		String newstr=str.replaceAll("\\s+"," ");
		String newstr2=newstr.trim();

		String arr[]=newstr2.split(" ");

		int iMax=0,iPos=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>=iMax)
			{
				iMax=arr[i].length();
				iPos=i;
			}
		}

		System.out.println("Max length of words is: "+iMax);
		System.out.println("Max length of words is : "+arr[iPos]);

		
	
	}


}