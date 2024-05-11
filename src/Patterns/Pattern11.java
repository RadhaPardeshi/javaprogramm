package Patterns;

public class Pattern11 {

	public static void main(String[] args) {
		
		int n=4;  int a=1; char ch='A';
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
			 if(i==j) 
			 {
				 System.out.print(ch+" ");
			 }
			 else if(i%2==0)
			 {
				 System.out.print(a+" ");
			 }
			 else if(i!=0)
			 {
				 ch='B';
				 System.out.print(ch+" ");
			 }
			 
			}
			System.out.println();
			
		}
			
	}
}
