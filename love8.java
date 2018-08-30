class abc
{
	int a;
	abc(int val)
	{	
		a=val;
	}
	abc sum()
	{
		abc s1=new abc(a+10);
		return s1;
	}
}
class love8
{
	public static void main(String args[])
	{
		abc o1=new abc(10);
		abc o2;
		o2=01.sum();
		System.out.println(o2);
		
	}
}