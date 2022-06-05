import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame
{
    public Frame fobj;

    public MarvellousFrame(String name)
    {
        fobj=new Frame(name);
        fobj.setSize(600,800);
        fobj.setVisible(true);

        fobj.addWindowListener(new MarvellousListener());

    }
}

class MarvellousListner extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class EventHandling4
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        System.out.println("Print data on console");

        MarvellousFrame mobj=new MarvellousFrame("PPA");
    }
}