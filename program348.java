import java.lang.*;
import java.util.*;

class program348
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		long iNo=sobj.nextLong();
	
		long iMask=0xF000000F;

		long iRet=	iNo  &  iMask;

		if(iRet==iMask)
		{
			System.out.println("First Nibble is on");
		}
		else
		{
			System.out.println("first Nibble is off");
		}
	
	}
}