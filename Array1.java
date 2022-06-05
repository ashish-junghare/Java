import java.lang.*;

class Array1
{
    public static void main(String arg[])
    {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println("Size of array is: "+arr.length);
        System.out.println("Elements of array is: "+arr);
        System.out.println("For loop");
        int iCnt=0;
        for(iCnt=0;iCnt<arr.length;iCnt++)
        {
            System.out.println(arr[iCnt]);
        }
        System.out.println("While loop");
        iCnt=0;
        while(iCnt<arr.length)
        {
            System.out.println(arr[iCnt]);
            iCnt++;
        }
        System.out.println("For each");
        for(int no:arr)
        {
            System.out.println(no);
        }
    }
}