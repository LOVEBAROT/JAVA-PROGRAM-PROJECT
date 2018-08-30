class a
{
	int x;
	void f1(int y)
	{
		x=y;
		System.out.println("value of x="+x);
	}
}
class b extends a
{
		int z=10;
		void f2()
		{
			
			super.f1(30);
			System.out.println("value of z="+z);
		}
}
class apollo3
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.f2();
		
	}
}
