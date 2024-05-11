package PracticeProgramm;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter any positive integer value");
		int a=sc.nextInt();
	    String b =(a%2==0 ? "even Number" : "odd Number");
		System.out.println(b);
		
	}
}
