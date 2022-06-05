
import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

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
        int i=0,j=0;
        for(i = iRow; i >= 1;i--)
        {
            for(j = 1; j<= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.print("\n");
        }

         for(i = 2; i <= iRow;i++)
        {
            for(j = 1; j<= i; j++)
            {
                        System.out.print("*\t");
            }
            System.out.print("\n");
        }

        
        
    }
}

class program110
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