// Template for probplems on Pattern printing

import java.lang.*;
import java.util.*;

class Pattern
{
    private int iRow, iCol;

    public Pattern(int a, int b)
    {
        iRow = a;
        iCol = b;
    }

    public void DisplayPattern()
    {
        int i=0;
        for(i=iRow;i>=1;i--)
        {
            System.out.print(i+"\t*\t");
        }
    }
}

class program84
{
    public static void main(String arg[])
    {
        int iRow=0,iCol=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the value for row: ");
        iRow = sobj.nextInt();

        System.out.println("Enter the value for column: ");
        iCol = sobj.nextInt();

        Pattern obj = new Pattern(iRow,iCol);

        obj.DisplayPattern();
    }
}