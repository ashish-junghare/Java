import java.lang.*;

class Base
{
    public int i,j;

    public void fun()
    {
        System.out.println("Base fun");
    }
    public void gun()
    {
        System.out.println("Base gun");
    }
    public void sun()
    {
        System.out.println("Base sun");
    }
}

class Derived extends Base
{
    public int x,y;

    public void fun()
    {
        System.out.println("Derived fun");
    }
    public void sun()
    {
        System.out.println("Derived sun");
    }
    public void run()
    {
        System.out.println("Derived run");
    }
}

class virtual
{
    public static void main(String arg[])
    {
       // Base bobj=new bobj();
        //Derived dobj=new dobj();

        //Derived obj1=new obj1();
        Base obj = new Derived();

        obj.fun();
        obj.gun();
        obj.sun();
        //obj.run();
    }

}