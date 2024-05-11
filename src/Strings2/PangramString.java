package Strings2;

import java.util.Scanner;

public class PangramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		int count=0;
	    for(char ch1='a';ch1<='z';ch1++)
	    {
	    	for(int i=0;i<ch.length;i++)
	    	{
	    		if(ch[i]==ch1)
	    		{
	    			count++;
	    			break;
	    		}
	    	}
	    }
	    if(count==26)
	    {
	    	System.out.println("Pangram String");
	    }
	    else
	    {
	    	System.out.println("Not a Pangram String");
	    }
	}

}
