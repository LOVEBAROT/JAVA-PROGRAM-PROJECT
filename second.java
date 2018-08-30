class second 
{
	public static void main(String args[])
	{
		char ch1[]={'c','l','a','s','s'};
		String S ="hello";
		System.out.println(S);
		System.out.println(S.length());
		String X=new String(ch1);
		
		for(int i=X.length()-1;i>=0;i--)
		{
			System.out.println(ch1[i]);
		}
	}
}