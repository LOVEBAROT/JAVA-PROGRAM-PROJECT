//using runnable interface
class threaddemo implements Runnable
{
	Thread t;
	String str="";
	threaddemo(String s)
	{
		t=new Thread(this);
		str=s;
		t.start();
	}
	public void run()
	{
		System.out.println(str);
	}
}
public class thread2
{
	public static void main(String args[])
	{
		threaddemo t1=new threaddemo("one thread create");
		
	}
}	