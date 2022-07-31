import java.lang.*;
import java.util.*;

class program356
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
		Set<Character>setobj=hobj.keySet();
		int iMax=0;
		char c=' ';
		for(char value:setobj)
		{
			if(hobj.get(value)>iMax)
			{
				iMax=hobj.get(value);
				c=value;
			}
		}
		System.out.println(c+" Occurs maximum numbers of times "+iMax);
	}
}