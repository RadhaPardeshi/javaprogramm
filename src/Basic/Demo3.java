package Basic;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter any positive integer value");
		int n=s.nextInt();
		int sum=0;
		int prod=1;
		int spy=n;
		while(n>0) {
			int rem=n%10;
			prod=rem*prod;
			sum=sum+rem;
			n=n/10;
		}
		if(sum==prod)
			System.out.println(spy +"is a spy number");
		else
			System.out.println(spy+"is not a spy number");
	}

}
