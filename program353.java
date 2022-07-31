import java.lang.*;
import java.util.*;

class program353
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1=sobj.nextLine();

		System.out.println("Enter second rotated string: ");
		String str2=sobj.nextLine();

		if(str1.length()!=str2.length())
		{
			System.out.println("Strings are not same due to length");
			return;
		}
		String str3=str1+str1;

		String d = str3.substring(1, 2);
		
		if(d.equals(str1))
		{
			System.out.println("String is same");
			
		}
		else
		{
			System.out.println("String is not same");
			
		}
	}
}