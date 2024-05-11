package Basic;

public class NeonNumber {
	public static void main(String[] args) 
{	
	for(int i=1;i<=100;i++)
	{
		int n=i;
		int sum=0;
		int sq=n*n;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (sum==n)
		{
			System.out.println(n+"is neon number");
		}
		
	    }
	}

}
