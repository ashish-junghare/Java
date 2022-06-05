import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter
{
    public Frame fobj;
    public Button bobj;
    //public TextField tobj;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);

        bobj=new Button("Addition");
        //tobj=new TextField();

        //tobj.setBounds(60,60,170,20);
        bobj.setBounds(100,100,70,40);


        fobj.add(bobj);
        //fobj.add(tobj);

        fobj.setSize(600,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        //bobj.addActionListener(this);
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter                 //implements WindowListener
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}


class FrameDemo5
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}