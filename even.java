package check;

import java.util.Scanner;

public class even {
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else if(a%2!=0)
		{
			System.out.println("number is odd");
		}
             else
                   {
                        System.out.println("not valid");
                   }
	}


}
