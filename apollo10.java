//dynamic method dispatch

class base
{
	void display()
	{
		System.out.println("base class method called");
	}
}
class derived extends base
{
	void display()
	{
		System.out.println("derived class method called");
	}
}
class apollo10
{
	public static void main(String args[])
	{
		base b1=new derived();
		b1.display();
	}
}