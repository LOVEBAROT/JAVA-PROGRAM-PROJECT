interface a
{
	int a=10;
}
interface b extends a
{
	int b=a+10;
}
class c implements  a,b
{
	int set()
	{
		int c=a+20;
		return c;
	}
}
class d extends c implements b
{
	void sum()
	{
		System.out.println("adding all the variable");
		int d=set()+b+a;
		System.out.println("answer is="+d);
	}
}
class apollo7
{
	public static void main(String args[])
	{
		d d1=new d();
		d1.sum();
	}
}

