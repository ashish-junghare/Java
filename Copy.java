import java.lang.*;

class Employee implements Cloneable 
{
    public int EID;
    public String Ename;
    public int ESalery;

    public Employee(int id,String str,int no)
    {
        this.EID=id;
        this.Ename=str;
        this.ESalery=no;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Copy
{
    public static void main(String arg[]) throws CloneNotSupportedException
    {
        Employee eobj=new Employee(11,"Ashish",20000);
        System.out.println("EID: "+eobj.EID+"\nName: "+eobj.Ename+"\nSalery: "+eobj.ESalery);
    
        Employee eobjX=(Employee)eobj.clone();
        System.out.println("EID: "+eobjX.EID+"\nName: "+eobjX.Ename+"\nSalery: "+eobjX.ESalery);

        eobj.Ename="Piyush";
        System.out.println("EID: "+eobjX.EID+"\nName: "+eobjX.Ename+"\nSalery: "+eobjX.ESalery);

    }
}