/*Q.4) Write a Java program which creates only one object. If user attempts to create second 
 * object, he should not be able to create it. (Using user defined Exception).*/
package UserDefineException;
class Demo
{
    
	public static void main(String[] args)
	{
		try 
		{
			ObjectCall obj1=new ObjectCall();//First Object Created
			System.out.println("1st object created");//First Object Display
			ObjectCall bj2=new ObjectCall();//Second Object Created
			System.out.println("2nd object created");
			ObjectCall obj3=new ObjectCall();//Thhird Object Created
			System.out.println("3rd object created");
		}
		catch(NoMoreException e)
		{
			System.out.println(e);
		}
	}
}
//class for object call
class ObjectCall 
{

	static int c=0;
	ObjectCall()throws NoMoreException
	{
		if(c==0)
		{
			c++;
		}
		else
		{
			throw new NoMoreException();
		}
	}
}

class NoMoreException extends Exception{
	 
	NoMoreException()
	{
		super("No more than one object create.");
	}
}