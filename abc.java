class abc
{	
	float width;
	float length;
	void area()
	{
		float reasult;
		reasult=length*width;
		System.out.println("area is="+reasult);
	}
}
class main
{
	public static void main(String args[])
	{
		abc obj=new abc();
		obj.width=12;
		obj.length=10;
	}
}