//thread synchronization

public class thread4
{
	public static void main(String args[])
	{
		b s=new b();
		a t1=new a(s,"{");
		a t2=new a(s,"}");
		a t3=new a(s,"india");
	}
}
class a extends Thread
{
	b s;
	a(b s,String str)
	{
		super(str);
		this.s=s;
		start();
	}
	public void run()
	{
		s.display(Thread.currentThread().getName());
	}
}
class b
{
	public synchronized void dispaly(String str)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(str);
		}
	}
}
		