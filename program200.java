//fourth bit toggle	

import java.lang.*;
import java.util.*;

import javax.swing.plaf.synth.SynthStyle;


class Bitwise
{
	public int OnBit(int iNo)
	{

		int iResult=0;
		int iMask=0X0000048;		

		iResult=(iNo ^ iMask);
		return iResult;
		
	}
}


class program200
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number:");
		int value=sobj.nextInt();

		Bitwise bobj=new Bitwise();
		int iRet=bobj.OnBit(value);
		System.out.println("Updated number is:"+iRet);

		
	
	}


}