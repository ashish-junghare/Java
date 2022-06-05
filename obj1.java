import java.lang.*;

class Employee
{
    public String name;
    public int Salery;

    public Employee(String str,int no)
    {
        this.name=str;
        this.Salery=no;
    }
    public String toString()
    {
        return "Employee name is "+name+" having salary "+Salery;
    }
}
class obj1
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        Employee eobj=new Employee("Ashish",11000);
        System.out.println(eobj.toString());
    }
}