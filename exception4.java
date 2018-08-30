class exception4
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		try
		{
			for(int i=1;i<=3;i++)
			{
				a[i]=i*i;
			}
			for(int i=0;i<3;i++)
			{
				a[i]=i/i;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero error");
		}
	}
}
		