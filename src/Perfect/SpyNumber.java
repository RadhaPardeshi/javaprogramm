package Perfect;

public class SpyNumber 
{
    public static void main(String[] args) 
    {
		for (int i=1;i<=1000;i++)
		{ 
			int n=i;
			int sum=0;
			int prod=1;
			int spy=n;
		  while(n>0)
		  {
			  int rem=n%10;
			  sum=sum+rem;
			  prod=prod*rem;
			  n=n/10;
		  }
		  if (sum==prod)
			  System.out.println(spy +"is a spy number");
		  else 
			  System.out.println(n+"is not a spy number");
	    }
    }
}
