package arrays;

import java.util.Scanner;

public class AddElementInArray {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a[]= {10,20,30,40};
		int [] newarr=new int[a.length+1];
		System.out.println("Enter one positive integer number");
		int n=s.nextInt();
		 for(int i=0;i<newarr.length;i++)
		 {
			 for(int j=0;j<newarr.length;j++)
				{    
				 if (i==2)
				 {
					 newarr[i]=n;
				 }
				 newarr[i]=a[i];
					System.out.println(newarr[j]);
				}
			 
		 }
		
	}

}
