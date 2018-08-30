class main
{
	int width;
	int height;
	
	void area()
	{
		int reasult;
		reasult=width*height;
		System.out.println("the area is="+reasult);
	}
}
class love2
{
	public static void main(String args[])
	{
		main ob1=new main();
		ob1.width=10;
		ob1.height=20;
		ob1.area();
	}	
}