import java.lang.*;
import java.util.*;

class program357
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter string: ");
		String str1=sobj.nextLine();

		String Arr[]=str1.split(" ");
		HashMap<String,Integer> hobj=new  HashMap<>();
		for(String ch:Arr)
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
		Set<String>setobj=hobj.keySet();
		int iMax=0;
		String c=" ";
		for(String value:setobj)
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