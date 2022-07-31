//reverse at word in string

import java.lang.*;
import java.util.*;

import javax.crypto.spec.IvParameterSpec;
import javax.swing.plaf.synth.SynthStyle;

class program311
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string1:");
		String str1=sobj.nextLine();

		System.out.println("Enter string2:");
		String str2=sobj.nextLine();

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();

		char arr[]=str1.toCharArray();
		char brr[]=str2.toCharArray();

		

		int Frequency1[]=new int[26];
		if(str1.length() != str2.length())
		{
			System.out.println("Strings are not anagram as lengths are different");
			return;
		}
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			Frequency1[arr[i]-97]++;
			Frequency1[brr[i]-97]--;
			
		}
		for(i=0;i<Frequency1.length;i++)
		{
			if(Frequency1[i]!=0)
			{
				break;
			}
		}
		if(i==26)
		{
			System.out.println("It is anagram");
		}
		else
		{
			System.out.println("It is not anagram");
		}
	}


}