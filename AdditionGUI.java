import java.lang.*;
import java.awt.*;
import java.awt.event.*;



class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;

    public Button bobj;


    public TextField tobj1,tobj2,tobj3;

    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(400,600);
        fobj.setVisible(true);
        fobj.setLayout(null);

        bobj=new Button("Addition");
        bobj.setBounds(150,450,80,40);
        fobj.add(bobj);

        Label lobj=new Label("Enter first number:",Label.LEFT);
        lobj.setBounds(120,110,140,60);
        Label lobj1=new Label("Enter second number:",Label.LEFT);
        lobj1.setBounds(120,260,140,60);
        Label lobj2=new Label("Addition is:",Label.LEFT);
        lobj2.setBounds(120,480,140,60);

        tobj1=new TextField();
        tobj1.setBounds(120,180,140,40);
        fobj.add(lobj);
        fobj.add(tobj1);

        tobj2=new TextField();
        tobj2.setBounds(120,320,140,40);
        fobj.add(lobj1);
        fobj.add(tobj2);

        tobj3=new TextField();
        tobj3.setBounds(120,550,140,40);
        fobj.add(lobj2);
        fobj.add(tobj3);

        fobj.addWindowListener(this);
        bobj.addActionListener(this);
    }
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent obj)
    {
        int No3=0;
        String str1=tobj1.getText();
        String str2=tobj2.getText();

        int No1=Integer.parseInt(str1);
        int No2=Integer.parseInt(str2);
        No3=No1+No2;
        obj.getSource();
        String str3 = String.valueOf(No3);    

        tobj3.setText(str3); 
    }
}



class FrameDemo4M
{
    public static void main(String arg[])
    {
        System.out.println("Print the data on console");

        MarvellousFrame mobj = new MarvellousFrame("Addition");

    }
}