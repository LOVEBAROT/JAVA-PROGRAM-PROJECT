class a
{
	int x;
	a(int y)
	{
		x=y;
		System.out.println("value of x="+x);
	}
}
class b extends a
{
		int z=10;
		b()
		{
			
			super(30);
			System.out.println("value of z="+z);
		}
}
class apollo4
{
	public static void main(String args[])
	{
		b b1=new b();

		
	}
}
