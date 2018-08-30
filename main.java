class Rect
{	
	int l,b;
	
	void setval(int x,int y)
	{
		l=x;
		b=y;
	}
	int area()
	{
		return(l*b);
	}
}
class main
{
	public static void main(String args[])
	{
		Rect rect = new Rect();
		rect.setval(50,8);
		System.out.println("area of rectangle"+rect.area());
	}
}