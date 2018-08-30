class rect
{
	int l,w;
	rect(int a,int b)
	{
		l=a;
		w=b;
		
	}
	int area()
	{
		return(l*w);
		
	}
}
class love4
{
	public static void main(String args[])
	{
		rect r1=new rect(20,30);
		
		System.out.println("area of rectnagle"+r1.area());
	}
}