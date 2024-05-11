package PracticeProgramm;

import java.util.Scanner;

public class OddNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter any positive integer value");
		int a=s.nextInt();
		if(a%2==0)
			System.out.println(a+"is a even number");
	}

}
