package PracticeProgramm;

import java.util.Scanner;

public class EvenOddUsingArrays {
	public static void main(String[] args) {
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter size of the elements");
		int size=s.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]+"is even number");
			else
				System.out.println(a[i]+"is odd number");
		}
		
	}

}
