class abc
{	
	int a,b,ans;
	void add(int a,int b)
	{
		ans=a+b;
		System.out.println("the addtion of two no"+ans);
	}
	void sub(int a,int b)
	{
		ans=a-b;
		System.out.println("the subtracation of two no"+ans);
	}
	void mul(int a,int b)
	{
		ans=a*b;
		System.out.println("the multiplication of two no"+ans);
	}void div(int a,int b)
	{
		ans=a/b;
		System.out.println("the divison of two no"+ans);
	}
}
class calc
{
	public static void main(String args[])
	{
		abc a1=new abc();	
		System.out.println("enter the two values for addition");
		   int i = args.length;

       		int a =Integer.parseInt(args[0]);
     		int b =Integer.parseInt(args[1]);
		a1.add(a,b);
		

		System.out.println("enter the two values for subtracation");
		   int j = args.length;

       		int c =Integer.parseInt(args[0]);
     		int d =Integer.parseInt(args[1]);
		a1.sub(c,d);
		

		

			
		
	
		a1.mul(a,b);
		a1.div(a,b);
	}
}

	