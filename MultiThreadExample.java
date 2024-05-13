/*
 Q2) Q.Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.

*/
package UserDefineException;
class FibonacciThread extends Thread 
{

    @Override
    public void run() 
    {
        System.out.println("Fibonacci Series:");
        int num=10,next,first=0,second=1;
    	System.out.println(first+" ");
    	System.out.println(second+" ");
    	for(int i=0;i<=num;i++)
    	{
    		next=first+second;
    		first=second;
    		second=next;
    		System.out.println(next);//display fibonacci series
        }
    	System.out.println();
    }
}

class ReverseOrderThread extends Thread 
{
    @Override
    public void run() 
    {
        System.out.println("Reverse Order:");
        for (int i = 9999; i >= 1; i--) 
        {
            System.out.print(i + " ");//display reverse order number
        }
        System.out.println();
    }
}

public class MultiThreadExample 
{
    public static void main(String[] args) 
    {
        // Create threads for Fibonacci series and reverse order
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseOrderThread reverseOrderThread = new ReverseOrderThread();

        // Start the threads
        reverseOrderThread.start();
        fibonacciThread.start();
        

        // Wait for both threads to finish before exiting the program
        try 
        {
            fibonacciThread.join();
            reverseOrderThread.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting.");
    }
}
