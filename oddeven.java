import java.util.Scanner;

class oddeven
{
	public static void main(String args[])
	{
		int X;
		System.out.println("enter number to check if it is even or odd");
		Scanner in = new Scanner(System.in);
		X = in.nextInt();
		
		if(X%2==0)
		{
			System.out.println("you entered an even number");
		}
		else
		{
			System.out.println("you entered an odd number");
		}
	}
}