class livingbodies extends Object
{
}
	class human extends livingbodies
	{

	}
	class boy extends human
	{
	}
	public class instanceofdemo
	{
		public static void main(String args[])
		{
			boy b1=new boy();
			System.out.println("the value of object b1"+b1);
			human h=b1;
			if(h instanceof boy)
			{
				System.out.println("it is now safe to downcast the object");
				boy b2=(boy)h;
				System.out.println("the value of object b2"+b2);
			}
		}
	}