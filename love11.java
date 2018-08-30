class abc
{
	int x;
	static int y=5;
	
	static void area()
	{
		y=6;
	}
	static class pqr
	{
		static string s1="hello";
	}
}
class love11
{
	public static void main(String args[])
	{
		abc.area();
		abc.y=10;
		System.out.println(abc.y);
		System.out.println(abc.pqr.s1);
		
	}
}