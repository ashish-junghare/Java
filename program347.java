import java.lang.*;
import java.util.*;

class program347
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		int iNo=sobj.nextInt();
	
		int iMask=0x0000000F;

		int iRet=	iNo  &  iMask;

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