//using thread class
class threaddemo extends Thread
{
	String str="";
	threaddemo(String s)
	{
		str=s;
		start();
	}
	public void run()
	{
		System.out.println(str);
	}
}
public class thread1
{
	public static void main(String args[])
	{
		threaddemo t1=new threaddemo("one thread create");
		
	}
}	