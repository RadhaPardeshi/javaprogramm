package basics;
import java.util.Scanner;
public class ReversingNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any positive integer value");
		int n=s.nextInt();
		int rev=0;
	    while(n>0) {
	    	int rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    }
	    System.out.println(rev);
	}

}
