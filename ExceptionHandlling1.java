//Q3).Java program to demonstrate working of chained exceptions 
package UserDefineException;
public class ExceptionHandlling1 
{ 
	public static void main(String[] args)
	{
        try
        {
            // Call a method that may throw an exception
            performOperation();
        } 
        catch (Exception e) 
        {
            // Catch the exception and print the stack trace
            e.printStackTrace();
        }
    }

    static void performOperation() throws Exception {
        try 
        {
            // Simulate an exception during the operation
            int result = 10 / 0; // This will throw an ArithmeticException
            System.out.println(result);
        } 
        catch (ArithmeticException ae) 
        {
            // Wrap the caught exception in a new exception and throw it
            throw new Exception("An error occurred during the operation.", ae);
        }
    }

}
