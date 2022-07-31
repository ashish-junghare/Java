import java.lang.*;
import java.util.*;

import javax.lang.model.element.Name;

//Database schema
class Student
{
	public int RID;
	public String Name;
	public int Salary;

	private static int Generator=0;
	public Student(String str,int value)
	{
		this.RID=++Generator;
		this.Name=str;
		this.Salary=value;
	}

	public void DisplayData()
	{
		System.out.println(this.RID+"\t"+this.Name+"\t"+this.Salary);
	}
}

class DBMS
{
	LinkedList <Student> lobj;
	public DBMS()
	{
		lobj=new LinkedList<>();
	}
	public void StartDBMS()
	{
		Scanner scanobj=new Scanner(System.in);
		System.out.println("Marvelobjous customised DBMS started successfully....");
		String Query="";
	
		while(true)
		{
			System.out.print("Marvellous DBMS Console->");
			Query=scanobj.nextLine();

			String tokens[]=Query.split(" ");
			int QuerySize=tokens.length;

			if(QuerySize==1)
			{
				if("Help".equals(tokens[0]))
				{
					System.out.println("This application used to demonstrate the customised DBMS");
					System.out.println("Exit : Terminate DBMS");
					System.out.println("Display all data: select * from student");

				}
				else if("Exit".equals(tokens[0]))
				{
					System.out.println("Thank you for using Marvellous DBMS");
					break;
				}
			}
			else if(QuerySize==2)
			{

			}
			else if(QuerySize==4)
			{
				if("select".equals(tokens[0]))
				{
					if("*".equals(tokens[1]))
					{
						DisplayAll();
					}
				}
			}
			else if(QuerySize==5)
			{
				if("Insert".equals(tokens[0]))
				{
					InsertData(tokens[3],Integer.parseInt(tokens[4]));
				}
			}
		}
	
	
	}
	public void InsertData(String str,int value)
	{
		Student sobj=new Student(str,value);
		lobj.add(sobj);
	}
	public void DisplayAll()
	{
		for(Student sref:lobj)
		{
			sref.DisplayData();
		}
	}
	public void DisplaySpecific(int rid)
	{
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
				sref.DisplayData();
				break;
			}
		}
	}
	public void DisplaySpecific(String name1)
	{
		for(Student sref:lobj)
		{
			if(sref.Name.equals(name1))
			{
				sref.DisplayData();
			}
		}
	}
	public void DeleteSpecific(int rid)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(sref.RID==rid)
			{
				lobj.remove(index);
				break;
			}
			index++;
		}
	}
	public void DeleteSpecific(String str)
	{
		int index=0;
		for(Student sref:lobj)
		{
			if(str.equals(sref.Name))
			{
				lobj.remove(index);
				break;
			}
			index++;
		}
	}

	public void AggregateMax()
	{
		int iMax=0;
		Student temp=null;
		for(Student sref:lobj)
		{
			if(sref.Salary>iMax)
			{
				iMax=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("Information of student having maximum salary: ");
		temp.DisplayData();
	}
	public void AggregateMin()
	{
		
		Student temp=lobj.getFirst();
		int iMin=(lobj.getFirst()).Salary;
		for(Student sref:lobj)
		{
			if(sref.Salary<iMin)
			{
				iMin=sref.Salary;
				temp=sref;
			}
		}
		System.out.println("Information of student having minimum salary: ");
		temp.DisplayData();
	}
	public void AggregateAverage()
	{
		int iSum=0,iCnt=0;
		for(Student sref:lobj)
		{
			iSum=iSum+sref.Salary;
			iCnt++;
		}
		iSum=iSum/iCnt;
		System.out.println("Information of students with average salary is: "+iSum);
	}
	public void AggregateSum()
	{
		long iSum=0;
		for(Student sref:lobj)
		{
			iSum=iSum+sref.Salary;
		}
		System.out.println("Information of students with sum is: "+iSum);
	}
	public void AggregateCount()
	{
		int iCnt=0;
		for(Student sref:lobj)
		{
			iCnt++;
		}
		System.out.println("Count is: "+iCnt);
	}
}

class program360
{
	public static void main(String arg[])
	{
		DBMS dobj=new DBMS();
		dobj.StartDBMS();
		/*dobj.InsertData("Piyush",1000);
		dobj.InsertData("Shruti",2000);
		dobj.InsertData("Sachin",3000);
		dobj.InsertData("Atharva",8000);
		dobj.InsertData("Supriya",9000);
		dobj.InsertData("Suraj",10000);
		dobj.DisplayAll();
		//dobj.DisplaySpecific(2);
		//dobj.DisplaySpecific("Piyush");
		//dobj.DeleteSpecific(2);
		//dobj.DeleteSpecific("Piyush");
		dobj.AggregateMax();
		dobj.AggregateMin();
		dobj.AggregateSum();
		dobj.AggregateAverage();
		dobj.AggregateCount();*/


		

	}
}