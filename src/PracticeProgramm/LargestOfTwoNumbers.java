package PracticeProgramm;

import java.util.Scanner;

public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Eneter any two positive integer value");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if (a>b)
		{
			System.out.println(a+"is greater than "+b);	
		}
		else
			System.out.println(b+"is greater than "+a);
	}

}
