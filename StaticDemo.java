import java.lang.*;

import javax.print.StreamPrintService;

class Demox
{
    public int i;
    public int j;
    public static int k;

    static
    {
        System.out.println("Inside static block");
        k=100;
    }
    public Demox()
    {
        System.out.println("Inside constructor");
        this.i=10;
        this.j=20;
    }
    public void fun()
    {
        System.out.println("Inside non-static fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);
    }
    public static void gun()
    {
        System.out.println("Inside static gun");
        System.out.println(k);
    }

}

class StaticDemo
{
    public static void main(String a[])
    {
        Demox.gun();
        Demox obj;
        obj=new Demox();
    
        /* Demox.gun();
        
        Demox obj;
        obj=new Demox();
        obj.fun();
        
        System.out.println(obj.i);
        System.out.println(obj.j);*/
        

    }

}
