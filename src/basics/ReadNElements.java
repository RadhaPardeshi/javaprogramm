package basics;

import java.util.Scanner;

public class ReadNElements 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter size of array");
		int size=s.nextInt();
		System.out.println("Size :"+size);
		 int [] r = new int [size];
		 System.out.println("Enter "+size+" Elements");
		 for(int i=0;i<r.length;i++)
		 {
			 r[i]=s.nextInt();
		 }
		 System.out.println("Entered elements are :");
		 for(int i=0;i<r.length;i++)
		 {
			 System.out.println(r[i]);
		 }
	}	 
}