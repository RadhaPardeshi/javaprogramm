package Basic;

import java.util.Scanner;
public class XToThePowerN1 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=s.nextInt();
		System.out.println("Enter n value");
		int n=s.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*x;

		}
		System.out.println(prod);
		
		}

}
