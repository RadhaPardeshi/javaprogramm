package basics;

import java.util.Scanner;

public class FriendsName {
   
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		String [] str = new  String [5];
		System.out.println("Enetr 5 friends name");
		
		for(int i=0;i<str.length;i++)
		{
			str[i]=s.next();
		}
		System.out.println("Entered friends name are :");
		for (int i =0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
	}
}
