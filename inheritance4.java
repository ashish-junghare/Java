import java.lang.*;

class base
{
    public int i;
    public int j;

    public void fun()
    {
        System.out.println("Inside base fun");
    }

}

class Derived extends base
{

    public int x;
    public int y;

    public void gun()
    {
        System.out.println("Inside derived gun");
    }

}

class DerivedX extends Derived
{

    public int a;
    public void sun()
    {
        System.out.println("Inside derivedX sun");
    }

}

class inheritance4
{

    public static void main(String a[])
    {
        System.out.println("Inside main block");
        DerivedX dobj=new Derived();
        
    }

}