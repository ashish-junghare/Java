import java.lang.*;
class Demo
{}

class classInfo
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        Demo obj=new Demo();
        Class cref=obj.getClass();
        System.out.println("class name of obj is: "+cref.getName());
        String Str="Marvellous";
        Class cref1=Str.getClass();
        System.out.println("Class name of str is: "+cref1.getName());
    
    }
}