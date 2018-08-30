class abc
{
	static int  hi;
	static int  wi;
	
	static void area()
	{
		int ans;
		ans=(hi*wi);
		System.out.println(ans);
	}
}
class love10
{
	public static void main(String args[])
	{
		abc.hi=10;
		abc.wi=20;
		abc.area();
	}
}