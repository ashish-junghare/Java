import java.lang.*;
import java.util.*;

class LL
{
    public static void main(String arg[])
    {
        LinkedList <String>obj=new LinkedList();
        
        obj.add("January");
        obj.add("February");
        obj.add("March");
        obj.add("April");
        obj.add(1,"New");
        obj.add("May");
        obj.add("Marvellous");
        obj.add("Marvellous");
        obj.add("Marvellous");

        System.out.println("ArrayList contsains: "+obj);
        System.out.println("Size is: "+obj.size());

        System.out.println("Elements using for loop");

        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));

        }
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
            String str;
            int iCnt=0;

            str=obj.get(i);
            if(str.equals("Mavrllous"))
            {
                iCnt++;
            }

        }

        int ret=obj.indexOf("April");
        System.out.println("Element is at "+ret);

        System.out.println("Element at index 3 is: "+obj.get(3));

        obj.remove(2);
        
        System.out.println("Using iterator");

        Iterator iobj=obj.iterator();
        while(iobj.hasNext())
        {
            System.out.println(iobj.next());

        }

        obj.clear();
        System.out.println("New ArrayList contsains: "+obj);

    }


}