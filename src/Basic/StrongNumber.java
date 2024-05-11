package Basic;
import java.util.Scanner;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any positive integer value");
		int n=s.nextInt();
		int sum=0;
		int strong=n;
		
		while(n>0)
		{
			int rem=n%10;
			int fact =1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==strong)
		{
			System.out.println(strong +"is a strong number");
		}
		else
		{
			System.out.println(strong +"is a not a strong number");
		}
		
	}

}
