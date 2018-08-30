class a
{
	int x;
	public void f1()
	{
		System.out.println("method f1 of class a"+x);
	}
	public void f2()
	{
		System.out.println("method f2 of class a"+x);	
	}
}
class b extends a
{
	int y;
	public void f1()
	{
		System.out.println("method f1 of class b"+y);	
	}
	public void f3()
	{
		int z;
		System.out.println("method f3 of class b");	
		x=3;
		y=4;
		z=5;
	}
}
class apollo1	
{
	public static void main(String args[])
	{
		b o1=new b();
		o1.f1();
		o1.f3();	
		o1.f2();
	}
}
	