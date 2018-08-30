class abc 
{
	int l,w;
	abc(int x,int y)
	{
		l=x;
		w=y;
	}
	int area()
	{
		return(l*w);
	}
}
class constructor1
{
	public static void main(String args[])
	{
		abc a1=new abc(10,20);
		a1.area();
		System.out.println("arae of rectengle is"+a1.area());
	}
}