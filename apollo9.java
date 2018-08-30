//polymorphism
class a extends Object
{
	public String toString()
	{
		return"a";
	}
}
class b extends a
{
	public String toString()
	{	
		return"b";
	}
}
class c extends b
{
	public String toString()
	{	
		return"c";
	}
}
public class apollo9
{
	public static void main(String args[])
	{
		fun(new c());
		fun(new b());
		fun(new a());
	}
	public static void fun(Object x)
	{
		System.out.println(x.toString());
	}
}
	