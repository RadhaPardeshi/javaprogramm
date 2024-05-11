package Basic;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter x integer value");
		int x=s.nextInt();
		System.out.println("Enter n integer value");
		int n=s.nextInt();
		int prod=1;
		int res=n;
		for(int i=1;i<=n;i++)
		{
			int rem=n%10;
			prod=rem*x;
			n=n/10;
			n--;
		}
		if (res==n)
			System.out.println(n+"is amstrong number");
		else
			System.out.println(n+"is not a amstrong number");
			
		
		
	}

}
