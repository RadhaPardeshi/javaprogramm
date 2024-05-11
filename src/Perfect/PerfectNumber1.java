package Perfect;

public class PerfectNumber1 {
	
	public static void main(String[]args)
	{
		System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
		
	}
	public static String isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==n)
		return n+"is perfect number";
		else
		 return n+" is not a perfect number";
	
	}
}
