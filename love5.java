class rect
{
	int l,w,p,q,r;
	rect(int a,int b)
	{
		l=a;
		w=b;
		
	}
	int area()
	{
		return(l*w);
		
	}
	rect(int c,int d,int e)
	{
		p=c;
		q=d;
		r=e;		
	}
	int sum()
	{
		return(p+q+r);
		
	}
}
class love5
{
	public static void main(String args[])
	{
		rect r1=new rect(20,30);
		
		System.out.println("area of rectnagle"+r1.area());
		rect r2=new rect(20,30,20);
		
		System.out.println("area of rectnagle"+r2.sum());
	}
}