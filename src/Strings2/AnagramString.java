package Strings2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1=s.next();
		String s2=s.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean res = Arrays.equals(ch1, ch2);
		if(res)
		{
			System.out.println("Anagram String");
		}
		else
		{
			System.out.println("Not a Anagram String");
		}
	}

}
