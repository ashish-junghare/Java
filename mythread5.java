import java.lang.*;

class Demo extends Thread
{
    public void run()   //Compulsory Running state
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Value of i: "+i+" name: "+getName());
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException obj)
            {
    
            }
        }
    
    }
    
}


class mythread5
{
    public static void main(String arg[]) throws Exception
    {
        Demo obj1 = new Demo();     //new state
        Thread t1=new Thread(obj1,"First");

        Demo obj2 = new Demo();     //new state
        Thread t2=new Thread(obj2,"Second");

        t1.start();  //Runnable
        t1.join();

        t2.start();

        //Dead state
    }
}