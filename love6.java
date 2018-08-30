class rect
{
	int a,b,c,d,e;
	
	void sum(int a,int b)
	{
		int ans=(a+b);
		System.out.println("two no sum is"+ans);
		
	}
	
	void sum(int c,int d,int e)
	{
		int ans1=(c+d+e);
		System.out.println("the sum of three no"+ans1);
		
	}
}
class love6
{
	public static void main(String args[])
	{
		rect r1=new rect();
		r1.sum(10,20);
		
		r1.sum(10,20,30);
	}
}