import java.lang.*;
import java.awt.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj=new Frame(name);
        fobj.setSize(600,800);
        fobj.setVisible(true);
    }
}

class FrameDemo2
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        System.out.println("Print data on console");

        MarvellousFrame mobj=new MarvellousFrame("PPA");
    }
}