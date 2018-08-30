//multithreading

class threaddemo extends Thread
{
	String msg;
	threaddemo(String str)
	{
		msg=str;
		start();
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(msg);
		}
		
	}
}
public class thread3
{
	public static void main(String args[])
	{
		threaddemo t1=new threaddemo("first thread");
		threaddemo t2=new threaddemo("second thread");
		threaddemo t3=new threaddemo("third thread");
	}
}