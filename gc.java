class gc
{
	public static void main(String args[])
	{
		Runtime obj=Runtime.getRuntime();
		System.out.println("avalible free memory "+obj.freeMemory());
		
		for(int i=0;i<1000;i++)
		{
			Garbage g=new Garbage(i);
			
		}
		
		System.out.println("free memory before caling  garbage collector"+obj.freeMemory());
		//System.runFinalization();
		System.gc();
		System.out.println("freee memory after caling  garbage collector"+obj.freeMemory());
	}
}
class Garbage
{
	int id;
	Garbage(int i)
	{
		this.id=i;
	}
	protected void finalize()
	{
		System.out.println("garbage collecation object"+id+"has been finalized");
	}
}