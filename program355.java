import java.lang.*;
import java.util.*;

class program355
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter first string: ");
		String str1=sobj.nextLine();

		char Arr[]=str1.toCharArray();

		HashMap<Character,Integer> hobj=new  HashMap<>();
		for(char ch:Arr)
		{
			if(hobj.containsKey(ch))
			{
				hobj.put(ch, hobj.get(ch)+1);
			}
			else
			{
				hobj.put(ch, 1);
			}
		}
		System.out.println(hobj);


	}
}