import java.lang.*;

class Demo
{
    public int Addition(int i,int j)
    {
        return i+j;
    }

    public int Addition(int i,int j,int k)
    {
        return i+j+k;
    }

    public int Addition(int i,int j,int k,int z)
    {
        return i+j+k+z;
    }

}


class override
{
    public static void main(String arg[])
    {
        Demo obj =new Demo();
        int ret=0;
        ret=obj.Addition(10,20);
        System.out.println(ret);
        ret=obj.Addition(10,20,30);
        System.out.println(ret);
        ret=obj.Addition(10,20,30,40);
        System.out.println(ret);
    }

}