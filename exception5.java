class exception5
{
	public static void main(String args[])
	{
		int a=10,b=-1;	
		try
		{
			b=a/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch block"+e);
		}
		finally
		{
			if(b!=-1)
			{
				System.out.println("error are occured");
			}
			else
			{
				System.out.println("error are not occured");
			}
		}
	}

}
						