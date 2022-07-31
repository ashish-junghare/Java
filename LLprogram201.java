import java.lang.*;
import java.util.*;

import javax.lang.model.util.ElementScanner6;

class node
{
    public int data;
    public node next;
}


class SinglyLL
{
    public node Head;
    public int Count;

    public SinglyLL()
    {
        Head=null;
        Count=0;
    }
    public void InsertFirst(int no)
    {
        node newn=null;
        newn=new node();

        newn.data=no;
        newn.next=null;

        if(Head==null)
        {
            Head=newn;
        }
        else
        {
            newn.next=Head;
            Head=newn;
        }
        Count++;
    }

    public void InsertLast(int no)
    {
        node newn=null;
        newn=new node();

        newn.data=no;
        newn.next=null;

        if(Head==null)
        {
            Head=newn;
        }
        else
        {
            node temp=Head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newn;
        }
        Count++;
    }

    public void DeleteFirst()
    {
        if(Head==null)
        {
            return;
        }
        else if(Count==1)
        {
            Head=null;
        }
        else
        {
            node temp=Head;
            Head=Head.next;
            temp=null;
        }
        Count--;
    }

    public void DeleteLast()
    {
        if(Head==null)
        {
            return;
        }
        else if(Count==1)
        {
            Head=null;
        }
        else
        {
            node temp=Head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
        Count--;
    }

    public void InsertAtPos(int no,int pos)
    {
        if(pos<1||pos>Count+1)
        {
            return;
        }
        else if(pos==1)
        {
            InsertFirst(no);
        }
        else if(pos==Count+1)
        {
            InsertLast(no);
        }
        else
        {
            node temp=Head;
            node newn=null;
            newn=new node();

            newn.data=no;
            newn.next=null;
            int iCnt=0;
            for(iCnt=1;iCnt<pos-1;iCnt++)
            {
                temp=temp.next;
            }
            newn.next=temp.next;
            temp.next=newn;
            Count++;
        }


    }

    public void DeleteAtPos(int pos)
    {
        if(pos<1||pos>Count)
        {
            return;
        }
        else if(pos==1)
        {
            DeleteFirst();
        }
        else if(pos==Count)
        {
            DeleteLast();
        }
        else
        {
            node temp=Head;
            node tempDel=null;
            int iCnt=0;
            for(iCnt=1;iCnt<pos-1;iCnt++)
            {
                temp=temp.next;
            }
            tempDel=temp.next;
            temp.next=temp.next.next;
            tempDel=null;
            Count--;
        }


    }

    public void Display()
    {
        node temp=Head;
        System.out.println("Element from linked list are: ");
        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|->");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
    public int CountNode()
    {
        return Count;

    }



}




class LLprogram201
{
    public static void main(String arg[])
    {
        int iRet=0;
        SinglyLL obj=new SinglyLL();


        obj.InsertFirst(151);
        obj.InsertFirst(121);
        obj.InsertFirst(111);
        obj.InsertFirst(101);
        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.InsertLast(201);

        obj.DeleteFirst();
        obj.DeleteLast();

        obj.InsertAtPos(75,3);
        obj.DeleteAtPos(3);
        
        obj.Display();
        iRet=obj.CountNode();
        System.out.println("\nNumber of elements are: "+obj.CountNode());
        
    }


}