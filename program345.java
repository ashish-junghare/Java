import java.lang.*;
import java.util.*;



class program345
{
	public static void main(String arg[])
	{
		int iDigit=0,iSum=0;
		Scanner sobj=new Scanner(System.in);

		System.out.println("Enter number: ");
		int iNo=sobj.nextInt();
		while(true)
		{
			iSum=0;
			while(iNo!=0)
			{
				iDigit=iNo%10;
				iSum=iSum+iDigit;
				iNo=iNo/10;
				
			}
			iNo=iSum;
			if(iNo<10)
			{
				break;
			}
		}
		System.out.println(iNo);
	}
}