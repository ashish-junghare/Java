import java.io.*;

class Input2
{
    public static void main(String arg[]) throws IOException
    {
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedInputStream bobj=new BufferedInputStream(iobj);

        System.out.println("Enter string");
        String str=bobj.readLine();

        System.out.println("Enter Integer");
        int no=Integer.parseInt(bobj.readLine());

        System.out.println("Enter float");
        float f=Float.parseFloat(bobj.readLine());

        System.out.println("Enter Double");
        double d =Double.parseDouble(bobj.readLine());

        System.out.println("Enter string is"+str);

        System.out.println("Enter integer is"+no);
        System.out.println("Enter float is "+f);
        System.out.println("Enter Double is"+d);
    }
}