package basics;
import java.util.Scanner;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any positive integer value");
		int n=s.nextInt();
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (rev==temp)
			System.out.println(temp+" is a palindrome Number");
		else
			System.out.println(temp+" is not a palindrome Number");
	}

}
