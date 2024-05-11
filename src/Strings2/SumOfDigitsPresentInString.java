package Strings2;

import java.util.Scanner;

public class SumOfDigitsPresentInString {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		int sum =0;
		char []ch = s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&& ch[i]<='9')
			{
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println("Sum of total digits present in strings are :"+sum);
	}

}
