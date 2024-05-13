package UserDefineException;
/*Q.1) Write a program that creates 2 threads - each displaying a message 
 * (Pass the message as a parameter to the constructor). 
 * The threads should display the messages continuously till the user presses ctrl+c.
*/
public class threadmsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		DisplayMessage m1=new DisplayMessage("Hello.....");
		DisplayMessage m2=new DisplayMessage("Good Morning.....");
		m1.start();
		m2.start();
		System.out.println("Press ctrl+c to exit");
		while(true)
				{
				     Thread.sleep(1000);
				}
		}
		catch(InterruptedException e)
		{
		
		}
	}

}

class DisplayMessage extends Thread
{
	public String msg;
	public DisplayMessage(String msg)
	{
		this.msg=msg;
	}
	public void run()
	{
		try {
			while(true)
			{
				System.out.println(msg);
				Thread.sleep(100);
			}
		}
		catch(InterruptedException ie)
		{
			
		}
	}
}
