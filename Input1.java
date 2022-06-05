import java.lang.*;
import java.io.*;

class Input1
{
    public static void main(String arg[])//throws IOException
    {
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedReader bobj=new BufferedReader(iobj);

        try
        {
            System.out.println("Enter your name: ");
            String name=bobj.readLine();

            System.out.println("Enter your age: ");
            int age =Integer.parseInt(bobj.readLine());
            System.out.println("Hello "+name+". You are "+age+" now..");
        }
        catch(IOException obj)
        {
            System.out.println("Exception occurs");
        }
        finally
        {
            iobj=null;
            bobj=null;
        }
    }

}