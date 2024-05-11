package Strings2;

import java.util.Scanner;

public class ReplaceAllSpacesWithCharacter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		char[]ch=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')//If we give ' 'it is mandatory to give space otherwise it will show error
			{
				ch[i]=c;
			}
		}
		String res=new String(ch);
		System.out.println(res);
	}

}
