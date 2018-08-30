class a
{
	int x;
	{
		System.out.println("instance variable x"+x);
		x=3;
	}
	a()
	{
		System.out.println("intialization variable x"+x);
	}
}
class apollo5
{
	public static void main(String args[])
	{
		a o1=new  a();
	}	
}	