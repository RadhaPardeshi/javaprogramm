package basics;

import java.util.Scanner;

public class PrintCharElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		 char []a= new char [6];
		 System.out.println("Enter Characters");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.next().charAt(0);
			 
		 }
		 System.out.println("Entered characters are :");
		 
		 for (int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
		 
	}
}
