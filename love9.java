class abc
{
	int hi;
	int wi;
	abc(int hi,int wi)
	{	
		this.hi=hi;
		this.wi=wi;
	}
	void area()
	{
		int ans;
		ans=(hi*wi);
		System.out.println(ans);
	}
}
class love9
{
	public static void main(String args[])
	{
		abc a1=new abc(10,10);
		
		a1.area();
	}
}