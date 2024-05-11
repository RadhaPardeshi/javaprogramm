package Strings2;

import java.util.Scanner;

public class NoOfDigitsInString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&& ch<='9')
			{
				count++;
			}
		}
		System.out.println("Count of Digits present in String :"+count);
	}

}
