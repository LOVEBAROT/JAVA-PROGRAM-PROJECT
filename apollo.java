class a
{
	a()
	{
		System.out.println("constructor of class a");
	}
}
class b extends a
{
	b()
	{
		this(5);
		System.out.println("constructor of class b");
	}
	b(int i)
	{
		System.out.println("constructor of class b"+i);
	}
}
class apollo
{
	public static void main(String args[])
	{
		b o1=new b();
	}
}