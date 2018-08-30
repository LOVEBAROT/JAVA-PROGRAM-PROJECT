class abc
{
	public void f1()
	{
		System.out.println("hello");
	}
	class xyz
	{
		abc s1=new abc();
		public void f1()
		{
			System.out.println("friend");
		}
	}
	class DemoClass
	{
		public static void main(String args[])
		{
			xyz o1= new xyz();
			o1.s1.f1();
			
		}
	}
}