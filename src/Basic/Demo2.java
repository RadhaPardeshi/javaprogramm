package Basic;

public class Demo2 {
	public static void main(String[] args) {
		int n=20;
		int sum=0;
		int sq=n*n;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if (sum==n)
			System.out.println(n+"is a neon number");
		else
			System.out.println(n+"is not a neon number");
	}

}
