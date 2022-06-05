import java.io.*;

import javax.swing.plaf.synth.SynthStyle;

class StringXXXX
{
    public static void main(String a[])
    {
        String str1="Hello";
        String str2="Hello";
        String str3=new String("Hello");

        if(str1==str3)
        {
            System.out.println("String is same");
        }
        else
        {
            System.out.println("String is not same");
        }
        if(str1.equals(str3))
        {
            System.out.println("String is same");
        }
        else
        {
            System.out.println("String is not same");
        }
    }

}