//Command Line Arguments 


import java.io.*;

// f1 = 0, f2 =  1  f3 = f1+f2  1  2  3  5  8  13  n ;



class CmdLine
{
  
  public static void main(String args[])

   {

       int i = args.length;

       int a =Integer.parseInt(args[0]);
       int b =Integer.parseInt(args[1]);

 int sum = a+b;
  System.out.println("Sum = "+sum);

      System.out.println("Total args = "+i);
    
          for(int j=0;j<i;j++)
	{



	   System.out.println("args["+j+"]="+args[j]);

          }

 
   }


}