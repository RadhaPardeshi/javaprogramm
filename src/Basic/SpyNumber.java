package Basic;

public class SpyNumber {
	public static void main(String[] args) {
		System.out.println(isSpy(10));
		System.out.println(isSpy(8));
	}
	public static String isSpy(int n) 
	{
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
    	  return spy+"is a spy number";
      else
    	  return spy+"is not a neon number";
	}

}
