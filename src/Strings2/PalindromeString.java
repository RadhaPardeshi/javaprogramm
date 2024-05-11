package Strings2;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev =rev + s1.charAt(i);
		}
		if(rev.equalsIgnoreCase(s1))
		System.out.println(" is a palinddrome string");//No need to print original string 
		else
		System.out.println(" is not a palindrome String");
		
	}

}
