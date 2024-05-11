package Basic;

public class NeonNumber1 {
	public static void main(String[] args) 
	{
		System.out.println(isNeon(19));
		System.out.println(isNeon(9));
	}
	public static String isNeon(int n)
	{
		int sum=0;
		int sq=n*n;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
			
		}
		if(sum==n)
		return n+" is neon number";
		else
		return n+" is not aneon number";
		
	}

}
