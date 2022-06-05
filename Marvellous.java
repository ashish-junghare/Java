import java.lang.*;


class Demo15
{
    public int i;
    public int j;

    public Demo15()
    {
        this.i=0;
        this.j=0;
        System.out.println("Inside default constructor");
    }

    public Demo15(int x,int y)
    {
        this.i=x;
        this.j=y;
        System.out.println("Inside parameterised constructor");
    }
    public void fun()
    {
        System.out.println("Inside fun");
    }
    
    public void gun()
    {
        System.out.println("Inside gun");
    }
}
class Marvellous
{
    public static void main(String arg[])
    {
        System.out.println("Inside main...");
        Demo15 obj = new Demo15();
        obj.fun();
        obj.gun();
        System.out.println(obj.i);

        Demo15 objx = new Demo15(11,21);
        objx.fun();
        objx.gun();
        System.out.println(objx.i);
    }

}