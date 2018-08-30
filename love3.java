class rect
{
	int l,b;
	rect()
	{
		l=20;
		b=40;
	}
	int area()
	{
		return(l*b);
	}
}
class love3
{
	public static void main(String args[])
	{
		rect r1=new rect();
		System.out.println("area of rectnagle"+r1.area());
	}
}