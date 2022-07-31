import java.lang.*;
import java.util.*;

class program349
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		long iNo=sobj.nextLong();

		System.out.println("Enter starting point in range: ");
		int iStart=sobj.nextInt();

		System.out.println("Enter ending point in range: ");
		int iEnd=sobj.nextInt();
		
		if((iStart>32) && (iEnd<1))
		{
			return;
		}

		long iMask1=0xFFFFFFFF<<(iStart-1);
		long iMask2=0xFFFFFFFF>>(32-iEnd);
		long iMask3=iMask1&iMask2;


		long iRet=	iNo  &  iMask3;

		if(iRet==iNo)
		{
			System.out.println("Given range Nibble is ON");
		}
		else
		{
			System.out.println("Given range Nibble is OFF");
		}
	
	}
}