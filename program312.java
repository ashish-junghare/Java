//reverse at word in string

import java.lang.*;
import java.util.*;
import java.util.Arrays;

import javax.crypto.spec.IvParameterSpec;
import javax.swing.plaf.synth.SynthStyle;

class program312
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string1:");
		String str1=sobj.nextLine();

		System.out.println("Enter string2:");
		String str2=sobj.nextLine();


		char arr[]=str1.toLowerCase().toCharArray();
		char brr[]=str2.toLowerCase().toCharArray();

		Arrays.sort(arr);
		Arrays.sort(brr);

		if(Arrays.equals(arr, brr))
		{
			System.out.println("String is anagram");
		}
		else
		{
			System.out.println("String is not anagram");
		}

		
	}


}