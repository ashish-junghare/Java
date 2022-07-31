/*
1.student --- roll no,name,age
2.java menu driven linked list-
3.student class-->3 characteristics-->constructor
4.class-->LL<student>lobj=new ll();-->insert element
5.delete ,display, roll number viz display
6.UI->select * from student-->tokenize-->command[0]==select-->ll display-->command[0]==insert-->create obj and insert

*/

import java.lang.*;
import java.util.*;

import javax.security.auth.SubjectDomainCombiner;


class Student
{
	int iRollNo;
	String str;
	int iAge;

	public Student(int a,String b,int c)
	{
		iRollNo=a;
		str=b;
		iAge=c;
	}
}

class iNode 
{
	Student sobj=new Student();
	public iNode(int a,String b,int c)
	{
		super(a,b,c);
	}
	LinkedList<sobj> ll = new LinkedList<sobj>();

	public void read()
	{
		System.out.print(ll);
	}
	public void create(int a,String b,int c)
	{
		ll.addLast();
		sobj.iRollNo=a;
		sobj.str=b;
		sobj.iAge=c;
	}
	public void update(int iNewNo,String str1,int NewAge)
	{
		if (ll.contains(iNewNo))
		{
			sobj.str=str1;
			sobj.iAge=NewAge;
		}
		
	}
	public void delete(int iNewNo)
	{
		if (ll.contains(iNewNo))
		{
			ll.remove(iNewNo);
		}	
	}
}




class program359
{
	public static void main(String arg[])
	{
		System.out.println("Enter roll number: ");
		int a=sobj.nextInt();

		System.out.println("Enter student name: ");
		String b=sobj.nextLine();

		System.out.println("Enter age: ");
		int c=sobj.nextInt();
		
		iNode iobj=new iNode(a,b,c);

		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter your query: ");
		String str=sobj.nextLine();

		String[] Command = str.split(" ");

		if(Command[0]=="select")
		{
			iobj.read();
		}
		if(Command[0]=="update")
		{
			System.out.println("Enter updated roll number: ");
			int iNewNo=sobj.nextInt();

			System.out.println("Enter updated student name: ");
			String str1=sobj.nextLine();

			System.out.println("Enter updated age: ");
			ont NewAge=sobj.nextInt();

			iobj.update(iNewNo, str1, NewAge);
		}
		if(Command[0]=="remove")
		{
			System.out.println("Enter roll number to delete: ");
			int iNewNo=sobj.nextInt();
			iobj.delete(iNewNo);
		}
		if(Command[0]=="create")
		{
			System.out.println("Enter roll number: ");
			int x=sobj.nextInt();

			System.out.println("Enter student name: ");
			String y=sobj.nextLine();

			System.out.println("Enter age: ");
			int z=sobj.nextInt();
			iobj.create(x,y,z);
		}


	}
}