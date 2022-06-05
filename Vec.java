import java.lang.*;
import java.util.*;

class Vec
{
    public static void main(String arg[])
    {
        Vector <Integer>obj=new Vector<Integer>();
        obj.add(11);
        obj.add(21);
        obj.add(51);
        obj.add(101);
        obj.add(111);
        obj.add(151);
        
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));

        }
        Iterator iobj=obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());

        }
        obj.clear();
       
    }


}