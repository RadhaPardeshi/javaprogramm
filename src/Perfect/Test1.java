package Perfect;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) 	
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A  Number :");
		int num=s.nextInt();
		
		for (int j=1;j<=num;j++)
		{
			int n=j;
			int sum=0;
			for (int i=1;i<=n/2;i++)
			{
				if (n%i==0)
				{
					sum=sum+i;
				}
			}
			if (sum==n)
			System.out.println(n+"is a perfect number");
		}
	}

}
