import java.lang.*;
import java.awt.*;



class FrameDemo
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        System.out.println("Print data on console");

        Frame fobj=new Frame("Calculator");
        fobj.setSize(400,400);
        fobj.setVisible(true);
    }
}