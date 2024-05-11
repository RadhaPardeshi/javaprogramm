package Strings2;

import java.util.Scanner;

class ConcatString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String sc=s.nextLine();
		String res="";
		char[]ch=sc.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]!=' ')
			{
				res=res+ch[i];
			}	
		}
		System.out.println(res);
	}

}
