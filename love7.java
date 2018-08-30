class abc
{
	int hi;
	int wi;
	abc(int n,int w)
	{	
		hi=n;
		wi=w;
	}
	void area(abc o1)
	{
		int ans;
		ans=(hi+o1.hi)*(wi+o1.wi);
		System.out.println(ans);
	}
}
class love7
{
	public static void main(String args[])
	{
		abc a1=new abc(10,10);
		abc a2=new abc(10,20);
		a1.area(a2);
	}
}