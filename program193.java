//third bid is on or off

import java.lang.*;
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;


class Bitwise
{
	public boolean ChkBit(int iNo)
	{

		int iResult=0;
		int iMask=4;

		iResult=(iNo&iMask);

		if(iResult==0)
		{
			return false;
		}
		else
		{
			return true;
		}


		
	}
}


class program192
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number:");
		int value=sobj.nextInt();

		Bitwise bobj=new Bitwise();
		boolean bRet=bobj.ChkBit(value);
	
		if(bRet==true)
		{
			System.out.println("Bit is on");
		}
		else
		{
			System.out.println("Bit is off");
		}
	
	}


}