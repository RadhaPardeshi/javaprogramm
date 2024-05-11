package basics;
import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any positive integer value");
		int n=sc.nextInt();
		int sum =1;
		
		while(n>0) {
			int rem=n%10;
			sum=sum*rem;
			n=n/10;
		}
		System.out.println(sum);
	}

}
