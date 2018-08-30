class abc 
{
	int l,w;
	abc()
	{
		l=10;
		w=20;
	}
	int area()
	{
		return(l*w);
	}
}
class constructor
{
	public static void main(String args[])
	{
		abc a1=new abc();
		a1.area();
		System.out.println("arae of rectengle is"+a1.area());
	}
}