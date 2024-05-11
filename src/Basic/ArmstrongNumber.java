package Basic;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int temp=n;
		int temp1=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		int sum=0;
		while(temp>0)
		{
			int x=temp%10;
			int prod=1;
			
			for(int i=1;i<=count;i++)
			{
				prod=prod*x;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(sum==temp1)
			System.out.println(temp1+"  is armstrng number");
		else
			System.out.println(temp1+"  is not a armstrong number");
		
		
		
	}

}
