import java.lang.*;

class base
{
    public int i;
    public int j;

    public base()
    {
        System.out.println("Inside base constructor");
        this.i=10;
        this.j=20;
    }

    public base(int a,int b)
    {
        System.out.println("Inside para base constructor");
        this.i=a;
        this.j=b;
    }

    public void fun()
    {
        System.out.println("Inside base fun");
    }

    public void fun(int x)
    {
        System.out.println("Inside base fun with int parameter");
    }

    public void gun()
    {
        System.out.println("Inside base gun");
    }

}

class Derived extends base
{

    public int x;
    public int y;

    public Derived()
    {
        super(11,21);
        System.out.println("Inside derived constructor");
        this.x=30;
        this.y=40;
    }
    public void sun()
    {
        System.out.println("Inside derived sun");
        super.fun();
        System.out.println(super.i);
    }

}

class inheritance1
{

    public static void main(String a[])
    {
        System.out.println("Inside main block");
        Derived dobj=new Derived();
        
        dobj.sun();
        
    }

}
