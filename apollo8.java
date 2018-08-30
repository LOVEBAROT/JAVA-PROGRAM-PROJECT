//interface example and intialize four animal object

interface transport
{
	public void deliver();
}
abstract class animal
{
	string item;
	abstract void deliver();
}
class tiger extends animal
{
	public void deliver()
	{

	}
}
class camel extends animal implements transport
{
	camel(String s1)
	{
		String item=s1;
		System.out.println(" camels are used in deserts to carry"+item);
	}
	public void deliver()
	{
		System.out.println(" camels are used in deserts to carry"+item);
	}
}
class deer extends animal
{
	public void deliver()
	{
	
	}
}
class donkey extends animal implements transport
{
	donkey(String s1)
	{
		String item=s1;
		System.out.println(" donkeys can carry"+item);
	}
	public void deliver()
	{
		System.out.println(" donkeys can carry"+item);
	}
}
class apollo8
{
	public static void main(String args[])
	{
		transport[] t=new transport[4];
		t[1]=new camel("goods and people");
		t[2]=new donkey("heavey load");
		System.out.println("transport interface is implemented by following animals");
		t[1].deliver();
		t[2].deliver();
	}	
}	