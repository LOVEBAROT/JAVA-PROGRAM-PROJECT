class abc
{
	int a,b,c;
	abc(int x,int y)
	{
		a=x;
		b=y;
	}
	void sum(int a,int b)
	{
		int ans;
		ans=a+b;
		System.out.println("two arg ans"+ans);
	}
	abc(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void sum(int a,int b,int c)
	{
		int ans1;
		ans=a+b+c;
		System.out.println("two arg ans"+ans1);
	}
}
class moverload
{
	public static void main(String args[])
	{
		abc a1=new abc(10,20);
		a1.sum();
		abc a2=new abc(10,20,30);
		a2.sum();
	}
}